package poo.tp.domain.movies.model;

public class Classification {
  private String ID;
  private String name;

  public Classification(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public Classification(String name) {
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
    return "Classification{" +
            "ID='" + ID + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
