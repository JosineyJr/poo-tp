package poo.tp.app.mapper;

import java.util.ArrayList;
import java.util.List;

import poo.tp.app.dto.auth.CreateRoleDto;
import poo.tp.app.dto.auth.RoleDto;
import poo.tp.domain.model.auth.Role;

public class RoleMapper {
  public static RoleDto mapRoleEntityToRoleDto(Role role) {
    return new RoleDto(role.getID(), role.getName());
  }

  public static CreateRoleDto mapRoleEntityToCreateRoleDto(Role role) {
    return new CreateRoleDto(role.getName());
  }

  public static Iterable<RoleDto> mapRoleEntitiesToRoleDtos(Iterable<poo.tp.domain.model.auth.Role> roles) {
    List<RoleDto> roleDtos = new ArrayList<RoleDto>();

    for (Role role : roles) {
      roleDtos.add(mapRoleEntityToRoleDto(role));
    }

    return roleDtos;
  }
}
