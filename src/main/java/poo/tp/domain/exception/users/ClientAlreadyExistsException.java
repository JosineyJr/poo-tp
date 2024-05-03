package poo.tp.domain.exception.users;

public class ClientAlreadyExistsException extends Exception {
  public ClientAlreadyExistsException(String message) {
    super(message);
  }

  public ClientAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }
}
