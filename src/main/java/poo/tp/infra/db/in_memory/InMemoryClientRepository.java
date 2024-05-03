package poo.tp.infra.db.in_memory;

import java.util.Map;

import poo.tp.domain.model.users.Client;
import poo.tp.domain.repository.users.IClientRepository;

public class InMemoryClientRepository extends InMemoryCRUDRepository<Client> implements IClientRepository {
  private Map<String, Client> clients;

  public InMemoryClientRepository() {
    super();

    this.clients = this.getObjects();
  }

  public Client findByCPF(String CPF) {
    return clients.values().stream().filter(client -> client.getCPF().equals(CPF)).findFirst().orElse(null);
  }
}
