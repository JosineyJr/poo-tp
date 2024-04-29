package poo.tp.domain.sales.model;

import java.util.Date;
import java.util.List;

import poo.tp.domain.products.model.Product;

public class GrocerySale extends Sale {
  private List<Product> products;

  public GrocerySale(String ID, Date date, float total, float fee, Balcony balcony, List<Product> products) {
    super(ID, date, total, fee, balcony);
    this.products = products;
  }

  public GrocerySale(Date date, float total, float fee, Balcony balcony, List<Product> products) {
    super(date, total, fee, balcony);
    this.products = products;
  }

  public List<Product> getProducts() {
    return products;
  }

  @Override
  public String toString() {
    return "GrocerySale{" +
            "products=" + products +
            '}';
  }
}
