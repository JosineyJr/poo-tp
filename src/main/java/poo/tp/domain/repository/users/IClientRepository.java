package poo.tp.domain.repository.users;

import poo.tp.domain.model.users.Client;
import poo.tp.domain.repository.IRepository;

public interface IClientRepository extends IRepository<Client> {
  /**
   * Finds a client by its CPF.
   * 
   * @param CPF The CPF of the client to be found.
   * @return The client found.
   */
  public Client findByCPF(String CPF);
}
