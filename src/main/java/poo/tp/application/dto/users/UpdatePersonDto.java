package poo.tp.application.dto.users;

public class UpdatePersonDto {
  private String ID;
  private String firstName;
  private String lastName;

  public UpdatePersonDto(String ID, String firstName, String lastName) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public UpdatePersonDto(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
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
}
