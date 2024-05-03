package poo.tp.infra.db.in_memory;

import java.util.Map;

import poo.tp.domain.model.auth.Role;
import poo.tp.domain.repository.auth.IRoleRepository;

public class InMemoryRoleRepository extends InMemoryCRUDRepository<Role> implements IRoleRepository {
  private final Map<String, Role> roles;

  public InMemoryRoleRepository() {
    super();

    this.roles = this.getObjects();
  }

  public Role findByName(String name) {
    return this.roles.values().stream().filter(role -> role.getName().equals(name)).findFirst().orElse(null);
  }
}
