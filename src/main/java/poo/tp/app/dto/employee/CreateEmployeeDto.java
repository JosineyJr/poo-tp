package poo.tp.app.dto.employee;

import poo.tp.domain.auth.model.Role;

public class CreateEmployeeDto {
  private String firstName;
  private String lastName;
  private String CPF;
  private Role role;

  public CreateEmployeeDto(String firstName, String lastName, String CPF, Role role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.CPF = CPF;
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCPF() {
    return CPF;
  }

  public Role getRole() {
    return role;
  }
}
