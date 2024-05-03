package poo.tp.domain.service.movies;

import poo.tp.app.dto.movies.CreateMovieDto;
import poo.tp.app.dto.movies.MovieDto;
import poo.tp.app.dto.movies.UpdateMovieDto;
import poo.tp.app.mapper.MovieMapper;
import poo.tp.domain.exception.movies.MovieNotFoundException;
import poo.tp.domain.model.movies.Movie;
import poo.tp.domain.repository.movies.IMoviesRepository;

public class MoviesService {
  private final IMoviesRepository moviesRepository;

  public MoviesService(IMoviesRepository moviesRepository) {
    this.moviesRepository = moviesRepository;
  }

  /**
   * Creates a new movie entity in the database.
   * 
   * @param createMovieDto the DTO with the data to create the movie entity
   */
  public void create(CreateMovieDto createMovieDto) {
    Movie movie = new Movie(createMovieDto.getName(), createMovieDto.getSynopsis(), createMovieDto.getTicketsQty(),
        createMovieDto.getTicketPrice(), createMovieDto.getDurationInMinutes(), createMovieDto.getClassification(),
        createMovieDto.getGenre(), createMovieDto.getExhibitionStartDate(), createMovieDto.getExhibitionEndDate());

    moviesRepository.create(movie.getID(), movie);
  }

  /**
   * Updates a movie entity in the database.
   * 
   * @param updateMovieDto the DTO with the data to update the movie entity
   */
  public void update(UpdateMovieDto updateMovieDto) throws MovieNotFoundException {
    Movie movie = moviesRepository.read(updateMovieDto.getID());

    if (movie == null) {
      throw new MovieNotFoundException("Movie not found.");
    }

    movie.setName(updateMovieDto.getName());
    movie.setSynopsis(updateMovieDto.getSynopsis());
    movie.setTicketsQty(updateMovieDto.getTicketsQty());
    movie.setTicketPrice(updateMovieDto.getTicketPrice());
    movie.setDurationInMinutes(updateMovieDto.getDurationInMinutes());
    movie.setClassification(updateMovieDto.getClassification());
    movie.setGenre(updateMovieDto.getGenre());
    movie.setExhibitionStartDate(updateMovieDto.getExhibitionStartDate());
    movie.setExhibitionEndDate(updateMovieDto.getExhibitionEndDate());

    moviesRepository.update(updateMovieDto.getID(), movie);
  }

  /**
   * Deletes a movie entity from the database.
   * 
   * @param ID the ID of the movie entity to delete
   */
  public void delete(String ID) throws MovieNotFoundException {
    Movie movie = moviesRepository.read(ID);

    if (movie == null) {
      throw new MovieNotFoundException("Movie not found.");
    }

    moviesRepository.delete(ID);
  }

  /**
   * Finds a movie by its ID.
   * 
   * @param ID the ID of the movie entity to find
   * @return the movieDto entity found
   */
  public MovieDto findByID(String ID) {
    Movie movie = moviesRepository.read(ID);

    if (movie == null) {
      return null;
    }

    return MovieMapper.mapMovieEntityToMovieDto(movie);
  }

  /**
   * Finds a movie by its name.
   * 
   * @param name the name of the movie entity to find
   * @return the movieDto entity found
   */
  public MovieDto findByName(String name) {
    Movie movie = moviesRepository.findByName(name);

    if (movie == null) {
      return null;
    }

    return MovieMapper.mapMovieEntityToMovieDto(movie);
  }

  /**
   * Finds all movies with a given name in the database.
   * 
   * @param name the name of the movies to find
   * @return an iterable of all movieDto entities with the given name
   */
  public Iterable<MovieDto> findAllByName(String name) {
    Iterable<Movie> movies = moviesRepository.findAllByName(name);

    return MovieMapper.mapMovieEntitiesToMovieDtos(movies);
  }

  /**
   * Finds all movies with a given genre in the database.
   * 
   * @param genre the genre of the movies to find
   * @return an iterable of all movieDto entities with the given genre
   */
  public Iterable<MovieDto> findAllByGenre(String genre) {
    Iterable<Movie> movies = moviesRepository.findAllByGenre(genre);

    return MovieMapper.mapMovieEntitiesToMovieDtos(movies);
  }

  /**
   * Finds all movies with a given classification in the database.
   * 
   * @param classification the classification of the movies to find
   * @return an iterable of all movieDto entities with the given classification
   */
  public Iterable<MovieDto> findAllByClassification(String classification) {
    Iterable<Movie> movies = moviesRepository.findAllByClassification(classification);

    return MovieMapper.mapMovieEntitiesToMovieDtos(movies);
  }
}
