package poo.tp.domain.products.repository;

import poo.tp.domain.products.model.Product;

public interface ProductRepository {
  /**
   * Saves or updates product in the database.
   * 
   * @param product the product entity to save or update
   * @return the saved or updated product entity
   */
  Product save(Product product);

  /**
   * Deletes the product from the database.
   * 
   * @param product the product entity to delete
   */
  void delete(Product product);

  /**
   * Finds a product by its ID.
   * 
   * @param ID the ID of the product to find
   * @return the product entity with the given ID
   */
  Product findByID(String ID);

  /**
   * Finds a product by its name.
   * 
   * @param name the name of the product to find
   * @return the product entity with the given name
   */
  Product findByName(String name);

  /**
   * Finds all products in the database.
   * 
   * @return an iterable of all product entities
   */
  Iterable<Product> findAll();

  /**
   * Finds all products with a given name in the database.
   * 
   * @param name the name of the products to find
   * @return an iterable of all product entities with the given name
   */
  Iterable<Product> findAllByName(String name);
}
