package poo.tp.domain.users.service;

import poo.tp.domain.users.model.Person;
import poo.tp.domain.users.repository.PersonRepository;
import poo.tp.application.dto.users.CreatePersonDto;
import poo.tp.application.dto.users.PersonDto;

public class PersonService {
  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  /**
   * Registers a new person in the database.
   * 
   * @param person the person dto to register
   * @return the registered person dto
   */
  public PersonDto registerPerson(CreatePersonDto createPersonDto) {
    Person personEntity = new Person(createPersonDto.getFirstName(), createPersonDto.getLastName(),
        createPersonDto.getCPF());

    Person person = personRepository.save(personEntity);

    PersonDto personDto = new PersonDto(person.getID(), person.getFirstName());

    return personDto;
  }
}
