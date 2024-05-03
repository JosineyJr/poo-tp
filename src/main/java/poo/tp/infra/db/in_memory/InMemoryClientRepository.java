package poo.tp.infra.db.in_memory;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.users.model.Client;
import poo.tp.domain.users.repository.IClientRepository;

public class InMemoryClientRepository implements IClientRepository {
  private final Map<String, Client> clients = new HashMap<>();

  public void create(Client client) {
    clients.put(client.getID(), client);
    System.out.println(this.clients.values());
  }

  public void update(Client client) {
    clients.put(client.getID(), client);
  }

  public void delete(String ID) {
    clients.remove(ID);
  }

  public Client findByID(String ID) {
    return clients.get(ID);
  }

  public Client findByCPF(String CPF) {
    return clients.values().stream().filter(client -> client.getCPF().equals(CPF)).findFirst().orElse(null);
  }

  public Iterable<Client> findAll() {
    return clients.values();
  }
}
