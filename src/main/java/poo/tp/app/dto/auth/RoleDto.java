package poo.tp.app.dto.auth;

public class RoleDto {
  private String ID;
  private String name;

  public RoleDto(String name) {
    this.name = name;
  }

  public RoleDto(String ID, String name) {
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
