package poo.tp.domain.exception.users;

public class EmployeeAlreadyExistsException extends Exception {
  public EmployeeAlreadyExistsException(String message) {
    super(message);
  }

  public EmployeeAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }
}
