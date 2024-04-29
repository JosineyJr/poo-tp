package poo.tp.application.dto.users;

public class PersonDto {
  private String ID;
  private String name;

  public PersonDto(String ID, String name) {
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
