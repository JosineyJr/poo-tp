package poo.tp.domain.movies.respository;

import poo.tp.domain.movies.model.Movie;

public interface MovieRepository {
  /**
   * Saves or updates movie in the database.
   * 
   * @param movie the movie entity to save or update
   * @return the saved or updated movie entity
   */
  Movie save(Movie movie);

  /**
   * Deletes the movie from the database.
   * 
   * @param movie the movie entity to delete
   */
  void delete(Movie movie);

  /**
   * Finds a movie by its ID.
   * 
   * @param ID the ID of the movie to find
   * @return the movie entity with the given ID
   */
  Movie findByID(String ID);

  /**
   * Finds a movie by its name.
   * 
   * @param name the name of the movie to find
   * @return the movie entity with the given name
   */
  Movie findByName(String name);

  /**
   * Finds all movies in the database.
   * 
   * @return an iterable of all movie entities
   */
  Iterable<Movie> findAll();

  /**
   * Finds all movies with a given name in the database.
   * 
   * @param name the name of the movies to find
   * @return an iterable of all movie entities with the given name
   */
  Iterable<Movie> findAllByName(String name);

  /**
   * Finds all movies with a given genre in the database.
   * 
   * @param genre the genre of the movies to find
   * @return an iterable of all movie entities with the given genre
   */
  Iterable<Movie> findAllByGenre(String genre);

  /**
   * Finds all movies with a given classification in the database.
   * 
   * @param classification the classification of the movies to find
   * @return an iterable of all movie entities with the given classification
   */
  Iterable<Movie> findAllByClassification(String classification);
}
