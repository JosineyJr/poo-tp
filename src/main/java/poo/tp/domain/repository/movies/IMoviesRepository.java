package poo.tp.domain.repository.movies;

import poo.tp.domain.model.movies.Movie;
import poo.tp.domain.repository.IRepository;

public interface IMoviesRepository extends IRepository<Movie> {
  /**
   * Finds a movie by its name.
   * 
   * @param name the name of the movie to find
   * @return the movie entity with the given name
   */
  Movie findByName(String name);

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
