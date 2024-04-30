package poo.tp.app.dto.employee;

public class DeleteEmployeeDto {
  private String ID;

  public DeleteEmployeeDto(String ID) {
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }
}
