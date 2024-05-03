package poo.tp.domain.model.users;

import java.util.ArrayList;

public class Client extends Person {
  private ArrayList<String> moviesPreferences;

  public Client(String ID, String firstName, String lastName, String CPF, ArrayList<String> moviesPreferences) {
    super(ID, firstName, lastName, CPF);
    this.moviesPreferences = moviesPreferences;
  }

  public Client(String firstName, String lastName, String CPF, ArrayList<String> moviesPreferences) {
    super(firstName, lastName, CPF);
    this.moviesPreferences = moviesPreferences;
  }

  public ArrayList<String> getMoviesPreferences() {
    return moviesPreferences;
  }

  public void setMoviesPreferences(ArrayList<String> moviesPreferences) {
    this.moviesPreferences = moviesPreferences;
  }

  @Override
  public String toString() {
    return "Client{" +
        "moviesPreferences=" + moviesPreferences +
        '}';
  }
}
