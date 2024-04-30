package poo.tp.domain.users.exception;

public class EmployeeAlreadyExistsException extends Exception {
  public EmployeeAlreadyExistsException(String message) {
    super(message);
  }

  public EmployeeAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }
}
