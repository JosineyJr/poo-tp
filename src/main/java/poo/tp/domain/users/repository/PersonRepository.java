package poo.tp.domain.users.repository;

import java.util.Optional;

import poo.tp.domain.users.model.Person;

public interface PersonRepository {
  /**
   * Saves or updates person in the database.
   *
   * @param person the person entity to save or update
   * @return the saved or updated person entity
   */
  Person save(Person person);

  /**
   * Deletes the person from the database.
   *
   * @param person the person entity to delete
   */
  void delete(Person person);

  /**
   * Finds a person by its ID.
   *
   * @param ID the ID of the person to find
   * @return the person entity with the given ID
   */
  Optional<Person> findByID(String ID);

  /**
   * Finds a person by its CPF.
   *
   * @param CPF the CPF of the person to find
   * @return the person entity with the given CPF
   */
  Optional<Person> findByCPF(String CPF);

  /**
   * Finds a person by its email.
   *
   * @param email the email of the person to find
   * @return the person entity with the given email
   */
  Optional<Person> findByEmail(String email);

  /**
   * Finds all persons in the database.
   *
   * @return an iterable of all person entities
   */
  Iterable<Person> findAll();
}
