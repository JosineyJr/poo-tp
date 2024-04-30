package poo.tp.app.dto.employee;

import poo.tp.domain.auth.model.Role;

public class UpdateEmployeeDto {
  private String ID;
  private String firstName;
  private String lastName;
  private Role role;

  public UpdateEmployeeDto(String ID, String firstName, String lastName, Role role) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
  }

  public String getID() {
    return ID;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Role getRole() {
    return role;
  }
}
