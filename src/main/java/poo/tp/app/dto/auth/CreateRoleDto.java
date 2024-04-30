package poo.tp.app.dto.auth;

public class CreateRoleDto {
  private String name;

  public CreateRoleDto(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
