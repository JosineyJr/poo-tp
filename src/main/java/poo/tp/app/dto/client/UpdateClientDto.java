package poo.tp.app.dto.client;

import java.util.ArrayList;

public class UpdateClientDto {
  private String ID;
  private String firstName;
  private String lastName;
  private ArrayList<String> moviesPreferences;

  public UpdateClientDto(String ID, String firstName, String lastName, ArrayList<String> moviesPreferences) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.moviesPreferences = moviesPreferences;
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

  public ArrayList<String> getMoviesPreferences() {
    return moviesPreferences;
  }
}
