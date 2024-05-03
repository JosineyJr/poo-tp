package poo.tp.domain.exception.users;

public class ClientNotFoundException extends Exception {
  public ClientNotFoundException(String message) {
    super(message);
  }

  public ClientNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
