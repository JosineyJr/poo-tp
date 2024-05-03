package poo.tp.domain.model.movies;

public class Genre {
  private String ID;
  private String name;

  public Genre(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public Genre(String name) {
    this.name = name;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Genre{" +
            "ID='" + ID + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
