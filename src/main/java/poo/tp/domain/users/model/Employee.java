package poo.tp.domain.users.model;

import poo.tp.domain.auth.model.Role;

public class Employee extends Person{
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

  @Override
  public String toString() {
    return "Employee{" +
            "role=" + role +
            '}';
  }
}
