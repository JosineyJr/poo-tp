package poo.tp.domain.financial.model;

public class Report {
  private String ID;
  private String description;
  private float total;
  private String reference;

  public Report(String ID, String description, float total, String reference) {
    this.ID = ID;
    this.description = description;
    this.total = total;
    this.reference = reference;
  }

  public Report(String description, float total, String reference) {
    this.description = description;
    this.total = total;
    this.reference = reference;
  }

  public String getID() {
    return ID;
  }

  public String getDescription() {
    return description;
  }

  public float getTotal() {
    return total;
  }

  public String getReference() {
    return reference;
  }

  @Override
  public String toString() {
    return "Report{" +
            "ID='" + ID + '\'' +
            ", description='" + description + '\'' +
            ", total=" + total +
            ", reference='" + reference + '\'' +
            '}';
  }
}
