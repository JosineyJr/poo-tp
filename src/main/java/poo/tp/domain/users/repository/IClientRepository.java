package poo.tp.domain.users.repository;

import poo.tp.domain.users.model.Client;

public interface IClientRepository extends IRepository<Client> {
  /**
   * Finds a client by its CPF.
   * 
   * @param CPF The CPF of the client to be found.
   * @return The client found.
   */
  public Client findByCPF(String CPF);
}
