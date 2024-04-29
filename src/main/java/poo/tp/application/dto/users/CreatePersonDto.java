package poo.tp.application.dto.users;

public class CreatePersonDto {
  private String firstName;
  private String lastName;
  private String CPF;

  public CreatePersonDto(String firstName, String lastName, String CPF) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.CPF = CPF;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCPF() {
    return CPF;
  }
}
