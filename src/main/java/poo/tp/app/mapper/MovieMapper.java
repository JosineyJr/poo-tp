package poo.tp.app.mapper;

import java.util.ArrayList;
import java.util.List;

import poo.tp.app.dto.movies.MovieDto;
import poo.tp.domain.model.movies.Movie;

public class MovieMapper {
  public static MovieDto mapMovieEntityToMovieDto(Movie movie) {
    return new MovieDto(movie.getID(), movie.getName(), movie.getSynopsis(), movie.getTicketsQty(),
        movie.getTicketPrice(),
        movie.getDurationInMinutes(), movie.getClassification().toString(), movie.getGenre().toString(),
        movie.getExhibitionStartDate().toString(), movie.getExhibitionEndDate().toString());
  }

  public static Iterable<MovieDto> mapMovieEntitiesToMovieDtos(Iterable<Movie> movies) {
    List<MovieDto> movieDtos = new ArrayList<>();

    for (Movie movie : movies) {
      movieDtos.add(mapMovieEntityToMovieDto(movie));
    }

    return movieDtos;
  }
}
