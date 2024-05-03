package poo.tp.domain.exception.movies;

public class MovieNotFoundException extends Exception {
  public MovieNotFoundException(String message) {
    super(message);
  }

  public MovieNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
