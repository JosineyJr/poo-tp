package poo.tp.app.dto.client;

import java.util.ArrayList;

public class CreateClientDto {
  private String firstName;
  private String lastName;
  private String CPF;
  private ArrayList<String> moviesPreferences;

  public CreateClientDto(String firstName, String lastName, String CPF, ArrayList<String> moviesPreferences) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.CPF = CPF;
    this.moviesPreferences = moviesPreferences;
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

  public ArrayList<String> getMoviesPreferences() {
    return moviesPreferences;
  }
}
