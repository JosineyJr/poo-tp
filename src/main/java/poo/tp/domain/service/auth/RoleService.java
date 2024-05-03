package poo.tp.domain.service.auth;

import poo.tp.app.dto.auth.CreateRoleDto;
import poo.tp.app.dto.auth.RoleDto;
import poo.tp.app.dto.auth.UpdateRoleDto;
import poo.tp.app.mapper.RoleMapper;
import poo.tp.domain.exception.auth.RoleAlreadyExistsException;
import poo.tp.domain.exception.auth.RoleNotFoundException;
import poo.tp.domain.model.auth.Role;
import poo.tp.domain.repository.auth.IRoleRepository;

public class RoleService {
  private final IRoleRepository roleRepository;

  public RoleService(IRoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  /**
   * Create a new role.
   * 
   * @param createRoleDto
   * @throws RoleAlreadyExistsException
   */
  public void create(CreateRoleDto createRoleDto) throws RoleAlreadyExistsException {
    Role roleFound = roleRepository.findByName(createRoleDto.getName());

    if (roleFound != null) {
      throw new RoleAlreadyExistsException("Role already exists.");
    }

    Role role = new Role(createRoleDto.getName());

    roleRepository.create(role.getID(), role);
  }

  /**
   * Update a role.
   * 
   * @param updateRoleDto
   * @throws RoleNotFoundException
   */
  public void update(UpdateRoleDto updateRoleDto) throws RoleNotFoundException {
    Role roleFound = roleRepository.read(updateRoleDto.getID());

    if (roleFound == null) {
      throw new RoleNotFoundException("Role not found.");
    }

    roleFound.setName(updateRoleDto.getName());

    roleRepository.update(roleFound.getID(), roleFound);
  }

  /**
   * Delete a role.
   * 
   * @param deleteRoleDto
   * @throws RoleNotFoundException
   */
  public void delete(String ID) throws RoleNotFoundException {
    Role roleFound = roleRepository.read(ID);

    if (roleFound == null) {
      throw new RoleNotFoundException("Role not found.");
    }

    roleRepository.delete(roleFound.getID());
  }

  /**
   * Get a role by ID.
   * 
   * @param ID
   * @return Role
   */
  public RoleDto findByID(String ID) {
    Role roleFound = roleRepository.read(ID);

    if (roleFound == null) {
      return null;
    }

    return new RoleDto(roleFound.getID(), roleFound.getName());
  }

  /**
   * Get a role by name.
   * 
   * @param name
   * @return Role
   */
  public RoleDto findByName(String name) {
    Role roleFound = roleRepository.findByName(name);

    if (roleFound == null) {
      return null;
    }

    return new RoleDto(roleFound.getID(), roleFound.getName());
  }

  /**
   * Get all roles.
   * 
   * @return Iterable<Role>
   */
  public Iterable<RoleDto> findAll() {
    Iterable<Role> roles = roleRepository.list();

    return RoleMapper.mapRoleEntitiesToRoleDtos(roles);
  }
}
