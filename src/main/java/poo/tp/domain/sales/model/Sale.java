package poo.tp.domain.sales.model;

import java.util.Date;

public class Sale {
  private String ID;
  private Date date;
  private float total;
  private float fee;
  private Balcony balcony;

  public Sale(String ID, Date date, float total, float fee, Balcony balcony) {
    this.ID = ID;
    this.date = date;
    this.total = total;
    this.fee = fee;
    this.balcony = balcony;
  }

  public Sale(Date date, float total, float fee, Balcony balcony) {
    this.date = date;
    this.total = total;
    this.fee = fee;
    this.balcony = balcony;
  }

  public String getID() {
    return ID;
  }

  public Date getDate() {
    return date;
  }

  public float getTotal() {
    return total;
  }

  public float getFee() {
    return fee;
  }

  public Balcony getBalcony() {
    return balcony;
  }

  @Override
  public String toString() {
    return "Sale{" +
            "ID='" + ID + '\'' +
            ", date=" + date +
            ", total=" + total +
            ", fee=" + fee +
            ", balcony=" + balcony +
            '}';
  }
}
