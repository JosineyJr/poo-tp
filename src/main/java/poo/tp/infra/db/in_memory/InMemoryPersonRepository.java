package poo.tp.infra.db.in_memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import poo.tp.domain.users.model.Person;
import poo.tp.domain.users.repository.IPersonRepository;

public class InMemoryPersonRepository implements IPersonRepository {
  private final Map<String, Person> persons = new HashMap<>();

  public Person create(Person person) {
    return persons.put(person.getID(), person);
  }

  public Person update(Person person) {
    return persons.put(person.getID(), person);
  }

  public void delete(String ID) {
    persons.remove(ID);
  }

  public Optional<Person> findByID(String ID) {
    return Optional.ofNullable(persons.get(ID));
  }

  public Optional<Person> findByCPF(String CPF) {
    return persons.values().stream().filter(person -> person.getCPF().equals(CPF)).findFirst();
  }

  public Iterable<Person> findAll() {
    return persons.values();
  }
}
