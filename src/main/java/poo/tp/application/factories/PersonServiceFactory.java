package poo.tp.application.factories;

import poo.tp.domain.users.service.PersonService;
import poo.tp.infra.db.in_memory.InMemoryPersonRepository;

public class PersonServiceFactory {
  public static PersonService createService() {
    InMemoryPersonRepository inMemoryPersonRepository = new InMemoryPersonRepository();

    return new PersonService(inMemoryPersonRepository);
  }
}
