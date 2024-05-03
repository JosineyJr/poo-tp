package poo.tp.domain.model.users;

import poo.tp.domain.model.auth.Role;

public class Employee extends Person {
  private Role role;

  public Employee(String ID, String firstName, String lastName, String CPF, Role role) {
    super(ID, firstName, lastName, CPF);
    this.role = role;
  }

  public Employee(String firstName, String lastName, String CPF, Role role) {
    super(firstName, lastName, CPF);
    this.role = role;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "role=" + role +
        '}';
  }
}
