package poo.tp.infra.db.in_memory.movies;

import java.util.Map;

import poo.tp.domain.model.movies.Movie;
import poo.tp.domain.repository.movies.IMoviesRepository;
import poo.tp.infra.db.in_memory.InMemoryCRUDRepository;

public class InMemoryMovieRepository extends InMemoryCRUDRepository<Movie> implements IMoviesRepository {
  private final Map<String, Movie> movies;

  public InMemoryMovieRepository() {
    super();

    this.movies = this.getObjects();
  }

  /**
   * Finds a movie by its name.
   * 
   * @param name the name of the movie to find
   * @return the movie entity with the given name
   */
  public Movie findByName(String name) {
    return this.movies.values().stream().filter(movie -> movie.getName().equals(name)).findFirst().orElse(null);
  }

  /**
   * Finds all movies with a given name in the database.
   * 
   * @param name the name of the movies to find
   * @return an iterable of all movie entities with the given name
   */
  public Iterable<Movie> findAllByName(String name) {
    return this.movies.values().stream().filter(movie -> movie.getName().equals(name))::iterator;
  }

  /**
   * Finds all movies with a given genre in the database.
   * 
   * @param genre the genre of the movies to find
   * @return an iterable of all movie entities with the given genre
   */
  public Iterable<Movie> findAllByGenre(String genreID) {
    return this.movies.values().stream().filter(movie -> movie.getGenre().getID().equals(genreID))::iterator;
  }

  /**
   * Finds all movies with a given classification in the database.
   * 
   * @param classification the classification of the movies to find
   * @return an iterable of all movie entities with the given classification
   */
  public Iterable<Movie> findAllByClassification(String classificationID) {
    return this.movies.values().stream()
        .filter(movie -> movie.getClassification().getID().equals(classificationID))::iterator;
  }
}
