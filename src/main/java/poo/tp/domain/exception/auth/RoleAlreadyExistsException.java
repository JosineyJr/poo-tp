package poo.tp.domain.exception.auth;

public class RoleAlreadyExistsException extends Exception {
  public RoleAlreadyExistsException(String message) {
    super(message);
  }

  public RoleAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }
}
