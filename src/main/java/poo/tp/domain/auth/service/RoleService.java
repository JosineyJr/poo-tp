package poo.tp.domain.auth.service;

import javax.management.relation.RoleNotFoundException;

import poo.tp.app.dto.auth.CreateRoleDto;
import poo.tp.app.dto.auth.DeleteRoleDto;
import poo.tp.app.dto.auth.RoleDto;
import poo.tp.app.dto.auth.UpdateRoleDto;
import poo.tp.app.mapper.RoleMapper;
import poo.tp.domain.auth.exceptions.RoleAlreadyExists;
import poo.tp.domain.auth.model.Role;
import poo.tp.domain.auth.repositoriy.IRoleRepository;

public class RoleService {
  private final IRoleRepository roleRepository;

  public RoleService(IRoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  /**
   * Creates a new role.
   * 
   * @param createRoleDto the role to be created.
   */
  public void create(CreateRoleDto createRoleDto) throws RoleAlreadyExists {
    Role roleFound = roleRepository.findByName(createRoleDto.getName());

    if (roleFound != null) {
      throw new RoleAlreadyExists("Role already exists");
    }

    Role role = new Role(createRoleDto.getName());

    roleRepository.create(role);
  }

  /**
   * Updates a role.
   * 
   * @param role the role to be updated.
   */
  public void update(UpdateRoleDto updateRoleDto) throws RoleNotFoundException {
    Role roleFound = roleRepository.findByID(updateRoleDto.getID());

    if (roleFound == null) {
      throw new RoleNotFoundException("Role not found.");
    }

    roleFound.setName(updateRoleDto.getName());

    roleRepository.update(roleFound);
  }

  /**
   * Deletes a role.
   * 
   * @param ID the ID of the role to be deleted.
   */
  public void delete(DeleteRoleDto deleteRoleDto) throws RoleNotFoundException {
    Role roleFound = roleRepository.findByID(deleteRoleDto.getID());

    if (roleFound == null) {
      throw new RoleNotFoundException("Role not found.");
    }

    roleRepository.delete(roleFound);
  }

  /**
   * Finds a role by its ID.
   * 
   * @param ID the ID of the role to be found.
   * @return the role found.
   */
  public Role findByID(String ID) {
    Role roleFound = roleRepository.findByID(ID);

    if (roleFound == null) {
      return null;
    }

    return roleRepository.findByID(ID);
  }

  /**
   * Finds a role by its name.
   * 
   * @param name the name of the role to be found.
   * @return the role found.
   */
  public Role findByName(String name) {
    Role roleFound = roleRepository.findByName(name);

    if (roleFound == null) {
      return null;
    }

    return roleRepository.findByName(name);
  }

  /**
   * Lists all roles.
   * 
   * @return all roles.
   */
  public Iterable<RoleDto> listAll() {
    Iterable<Role> roles = roleRepository.findAll();

    return RoleMapper.mapRoleEntitiesToCreateRoleDtos(roles);
  }
}
