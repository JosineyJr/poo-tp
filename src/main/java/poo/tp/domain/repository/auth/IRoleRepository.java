package poo.tp.domain.repository.auth;

import poo.tp.domain.model.auth.Role;
import poo.tp.domain.repository.IRepository;

public interface IRoleRepository extends IRepository<Role> {
  /**
   * Finds a role by its name.
   * 
   * @param name The name of the role to be found.
   * @return The role found.
   */
  public Role findByName(String name);
}
