package poo.tp.domain.repository.sales;

import poo.tp.domain.model.sales.Balcony;

public interface BalconyRepository {
  /**
   * Saves or updates balcony in the database.
   * 
   * @param balcony the balcony entity to save or update
   * @return the saved or updated balcony entity
   */
  Balcony save(Balcony balcony);

  /**
   * Deletes the balcony from the database.
   * 
   * @param balcony the balcony entity to delete
   */
  void delete(Balcony balcony);

  /**
   * Finds a balcony by its ID.
   * 
   * @param ID the ID of the balcony to find
   * @return the balcony entity with the given ID
   */
  Balcony findByID(String ID);

  /**
   * Finds a balcony by its name.
   * 
   * @param name the name of the balcony to find
   * @return the balcony entity with the given name
   */
  Balcony findByName(String name);

  /**
   * Finds all balconies in the database.
   * 
   * @return an iterable of all balcony entities
   */
  Iterable<Balcony> findAll();
}
