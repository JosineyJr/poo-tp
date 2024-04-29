package poo.tp.domain.auth.repositoriy;

import poo.tp.domain.auth.model.Role;

public interface RoleRepository {
  /**
   * Saves or updates role in the database.
   * 
   * @param role the role entity to save or update
   * @return the saved or updated role entity
   */
  Role save(Role role);

  /**
   * Deletes the role from the database.
   * 
   * @param role the role entity to delete
   */
  void delete(Role role);

  /**
   * Finds a role by its ID.
   * 
   * @param ID the ID of the role to find
   * @return the role entity with the given ID
   */
  Role findByID(String ID);

  /**
   * Finds a role by its name.
   * 
   * @param name the name of the role to find
   * @return the role entity with the given name
   */
  Role findByName(String name);

  /**
   * Finds all roles in the database.
   * 
   * @return an iterable of all role entities
   */
  Iterable<Role> findAll();
}
