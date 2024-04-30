package poo.tp.application.mapper;

import poo.tp.application.dto.users.CreatePersonDto;
import poo.tp.application.dto.users.PersonDto;
import poo.tp.domain.users.model.Person;

public class PersonMapper {
  /**
   * Maps a person dto to a person entity.
   * 
   * @param person the person dto to map
   * @return the mapped person entity
   */
  public static Person mapPersonDtoToPersonEntity(CreatePersonDto person) {
    return new Person(person.getFirstName(), person.getLastName(), person.getCPF());
  }

  /**
   * Maps a person entity to a person dto.
   * 
   * @param person the person entity to map
   * @return the mapped person dto
   */
  public static PersonDto mapPersonEntityToPersonDto(Person person) {
    return new PersonDto(person.getID(), person.getFirstName(), person.getLastName());
  }
}
