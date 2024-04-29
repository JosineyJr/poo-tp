package poo.tp.domain.users.model;

import java.util.List;

public class Client extends Person {
  private List<String> moviesPreferences;

  public Client(String ID, String firstName, String lastName, String CPF, List<String> moviesPreferences) {
    super(ID, firstName, lastName, CPF);
    this.moviesPreferences = moviesPreferences;
  }

  public Client(String firstName, String lastName, String CPF, List<String> moviesPreferences) {
    super(firstName, lastName, CPF);
    this.moviesPreferences = moviesPreferences;
  }

  public List<String> getMoviesPreferences() {
    return moviesPreferences;
  }

  public void setMoviesPreferences(List<String> moviesPreferences) {
    this.moviesPreferences = moviesPreferences;
  }

  @Override
  public String toString() {
    return "Client{" +
            "moviesPreferences=" + moviesPreferences +
            '}';
  }
}
