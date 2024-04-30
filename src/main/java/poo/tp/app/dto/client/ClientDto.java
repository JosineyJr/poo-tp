package poo.tp.app.dto.client;

public class ClientDto {
  private String ID;
  private String name;
  private String CPF;
  private String moviesPreferences;

  public ClientDto(String ID, String name, String CPF, String moviesPreferences) {
    this.ID = ID;
    this.name = name;
    this.CPF = CPF;
    this.moviesPreferences = moviesPreferences;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getCPF() {
    return CPF;
  }

  public String getMoviesPreferences() {
    return moviesPreferences;
  }
}
