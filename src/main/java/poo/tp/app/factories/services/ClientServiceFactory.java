package poo.tp.app.factories.services;

import poo.tp.domain.users.service.ClientService;
import poo.tp.infra.db.in_memory.InMemoryClientRepository;

public class ClientServiceFactory {
  public static ClientService createService() {
    InMemoryClientRepository inMemoryClientRepository = new InMemoryClientRepository();

    return new ClientService(inMemoryClientRepository);
  }
}
