package poo.tp.domain.service.movies;

import poo.tp.app.dto.movies.CreateMovieDto;
import poo.tp.app.dto.movies.UpdateMovieDto;
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
}
