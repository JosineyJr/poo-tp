package poo.tp.domain.model.auth;

import java.util.UUID;

public class Role {
  private String ID;
  private String name;

  public Role(String ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public Role(String name) {
    this.ID = UUID.randomUUID().toString();
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
