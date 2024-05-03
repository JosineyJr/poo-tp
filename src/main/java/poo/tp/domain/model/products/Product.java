package poo.tp.domain.model.products;

public class Product {
  private String ID;
  private String name;
  private float price;
  private int quantity;

  public Product(String ID, String name, float price, int quantity) {
    this.ID = ID;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name, float price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
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

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Product{" +
            "ID='" + ID + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
  }
}
