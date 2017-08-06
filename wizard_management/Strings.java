package wizard_management;

public class Strings extends Accessories {

  public Strings(double sale_price, double buy_price) {
    super(sale_price, buy_price);
  }

  public double calculateMarkup(double sale_price, double buy_price){
    double result = ((sale_price - buy_price)/buy_price) *100;
    return Math.round(result);
  }
}