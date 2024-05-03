package poo.tp.app.dto.auth;

public class UpdateRoleDto {
  private String ID;
  private String name;

  public UpdateRoleDto(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }
}
