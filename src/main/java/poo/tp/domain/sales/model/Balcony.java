package poo.tp.domain.sales.model;

public class Balcony {
  private String ID;
  private String name;

  public Balcony(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public Balcony(String name) {
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
}
