package poo.tp.domain.sales.respository;

import poo.tp.domain.sales.model.Sale;

public interface SaleRepository {
  /**
   * Saves or updates sale in the database.
   * 
   * @param sale the sale entity to save or update
   * @return the saved or updated sale entity
   */
  Sale save(Sale sale);

  /**
   * Deletes the sale from the database.
   * 
   * @param sale the sale entity to delete
   */
  void delete(Sale sale);

  /**
   * Finds a sale by its ID.
   * 
   * @param ID the ID of the sale to find
   * @return the sale entity with the given ID
   */
  Sale findByID(String ID);

  /**
   * Finds all sales in the database.
   * 
   * @return an iterable of all sale entities
   */
  Iterable<Sale> findAll();
}
