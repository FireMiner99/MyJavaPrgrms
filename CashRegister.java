public class CashRegister {
  private double payment = 0;
  private double purchase = 0;

  public double recordPurchase(double amount) {
    purchase = purchase + amount;
    return purchase;



  }

  public double enterPayment(double amount) {

    payment = payment + amount;
    return payment;


  }
  public double giveChange() {
    double change = payment - purchase;


    return change;

  }
  public double getPurchaseAmount() {
  double totalpurchase = purchase;

  return totalpurchase;
  }
  public double getPaymentAmount() {
    double totalpayment = payment;
    return totalpayment;



  }
  public double addTax() {
  double purchasewithtax = purchase * 0.06 + purchase;
  return purchasewithtax;

  }


  
}
