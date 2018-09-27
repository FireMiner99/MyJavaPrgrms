public class CashRegisterTester {
  public static void main(String[] args) {
    CashRegister register = new CashRegister();
    register.recordPurchase(200);
    register.recordPurchase(50);
    register.recordPurchase(1000);
    System.out.println("The amount purchased is $" +register.getPurchaseAmount());
    System.out.println("The amount purchased with tax is $"+register.addTax());
    register.addTax();
    register.enterPayment(1400);
    System.out.println("The payment is $" +register.getPaymentAmount());
    System.out.println("The change is $" +register.giveChange());
  }
}
