package poo.tp.domain.users.service;

import poo.tp.domain.users.exception.UserNotFoundException;
import poo.tp.domain.users.model.Person;
import poo.tp.domain.users.repository.PersonRepository;

import java.util.Optional;

import poo.tp.application.dto.users.CreatePersonDto;
import poo.tp.application.dto.users.PersonDto;
import poo.tp.application.dto.users.UpdatePersonDto;
import poo.tp.application.mapper.PersonMapper;

public class PersonService {
  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  /**
   * Registers a new person in the database.
   * 
   * @param createPersonDto the person dto to register
   * @return the registered person dto
   */
  public PersonDto registerPerson(CreatePersonDto createPersonDto) {
    Person personEntity = new Person(createPersonDto.getFirstName(), createPersonDto.getLastName(),
        createPersonDto.getCPF());

    Person person = personRepository.create(personEntity);

    PersonDto personDto = PersonMapper.mapPersonEntityToPersonDto(person);

    return personDto;
  }

  /**
   * Updates a person in the database.
   * 
   * @param updatePersonDto the person dto to update
   * @return the updated person dto
   */
  public PersonDto updatePerson(UpdatePersonDto updatePersonDto) {
    Optional<Person> personEntity = personRepository.findByID(updatePersonDto.getID());

    if (!personEntity.isPresent()) {
      throw new UserNotFoundException("Person not found with ID: " + updatePersonDto.getID());
    }

    Person person = personEntity.get();

    person.setFirstName(updatePersonDto.getFirstName());
    person.setLastName(updatePersonDto.getLastName());

    person = personRepository.update(person);

    PersonDto personDto = PersonMapper.mapPersonEntityToPersonDto(person);

    return personDto;
  }

  /**
   * Deletes a person in the database.
   * 
   * @param id the person id to delete
   */
  public void deletePerson(String ID) {
    Optional<Person> personEntity = personRepository.findByID(ID);

    if (!personEntity.isPresent()) {
      throw new UserNotFoundException("Person not found with ID: " + ID);
    }

    personRepository.delete(ID);
  }
}
