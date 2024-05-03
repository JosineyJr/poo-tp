package poo.tp.infra.db.in_memory;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.users.model.Client;
import poo.tp.domain.users.repository.IClientRepository;

public class InMemoryClientRepository extends InMemoryCRUDRepository<Client> implements IClientRepository {
  public InMemoryClientRepository() {
    super();
  }

  private final Map<String, Client> clients = new HashMap<>();

  public Client findByCPF(String CPF) {
    return clients.values().stream().filter(client -> client.getCPF().equals(CPF)).findFirst().orElse(null);
  }
}
