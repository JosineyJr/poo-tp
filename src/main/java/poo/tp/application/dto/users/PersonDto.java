package poo.tp.application.dto.users;

public class PersonDto {
  private String ID;
  private String firstName;
  private String lastName;

  public PersonDto(String ID, String firstName, String lastName) {
    this.ID = ID;
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
