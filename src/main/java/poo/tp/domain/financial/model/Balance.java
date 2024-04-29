package poo.tp.domain.financial.model;

import java.util.List;

import poo.tp.domain.sales.model.Balcony;

public class Balance extends Report {
  private List<Balcony> balconies;

  public Balance(String ID, String description, float total, String reference, List<Balcony> balconies) {
    super(ID, description, total, reference);
    this.balconies = balconies;
  }

  public Balance(String description, float total, String reference, List<Balcony> balconies) {
    super(description, total, reference);
    this.balconies = balconies;
  }

  public List<Balcony> getBalconies() {
    return balconies;
  }

  @Override
  public String toString() {
    return "Balance{" +
            "balconies=" + balconies +
            '}';
  }
}
