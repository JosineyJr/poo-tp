package poo.tp.domain.exception.auth;

public class RoleNotFoundException extends Exception {
  public RoleNotFoundException(String message) {
    super(message);
  }

  public RoleNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
