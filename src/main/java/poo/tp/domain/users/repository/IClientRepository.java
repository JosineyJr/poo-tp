package poo.tp.domain.users.repository;

import poo.tp.domain.users.model.Client;

public interface IClientRepository {
  /**
   * Creates a new client.
   * 
   * @param client The client to be created.
   */
  public void create(Client client);

  /**
   * Updates a client.
   * 
   * @param client The client to be updated.
   */
  public void update(Client client);

  /**
   * Deletes a client.
   * 
   * @param ID The ID of the client to be deleted.
   */
  public void delete(String ID);

  /**
   * Finds a client by its ID.
   * 
   * @param ID The ID of the client to be found.
   * @return The client found.
   */
  public Client findByID(String ID);

  /**
   * Finds a client by its CPF.
   * 
   * @param CPF The CPF of the client to be found.
   * @return The client found.
   */
  public Client findByCPF(String CPF);

  /**
   * Finds all clients.
   * 
   * @return All clients found.
   */
  public Iterable<Client> findAll();
}
