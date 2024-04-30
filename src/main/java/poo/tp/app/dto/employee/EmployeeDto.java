package poo.tp.app.dto.employee;

public class EmployeeDto {
  private String ID;
  private String name;
  private String role;

  public EmployeeDto(String ID, String name, String role) {
    this.ID = ID;
    this.name = name;
    this.role = role;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }
}
