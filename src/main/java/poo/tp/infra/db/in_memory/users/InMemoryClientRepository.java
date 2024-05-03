package poo.tp.infra.db.in_memory.users;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.model.users.Client;
import poo.tp.domain.repository.users.IClientRepository;
import poo.tp.infra.db.in_memory.InMemoryCRUDRepository;

public class InMemoryClientRepository extends InMemoryCRUDRepository<Client> implements IClientRepository {
  public InMemoryClientRepository() {
    super();
  }

  private final Map<String, Client> clients = new HashMap<>();

  public Client findByCPF(String CPF) {
    return clients.values().stream().filter(client -> client.getCPF().equals(CPF)).findFirst().orElse(null);
  }
}
