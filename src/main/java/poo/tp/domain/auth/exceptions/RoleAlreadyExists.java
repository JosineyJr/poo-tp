package poo.tp.domain.auth.exceptions;

public class RoleAlreadyExists extends Exception {
  public RoleAlreadyExists(String message) {
    super(message);
  }

  public RoleAlreadyExists(String message, Throwable cause) {
    super(message, cause);
  }
}
