import java.util.ArrayList;

interface IPayment { // 1 mark
   void pay();
}

interface IMode { // 1 mark
   void paymentMode();
}

class CashPayment implements IPayment { // 1 mark
   public void pay() {
       System.out.println("Cash Payment made ");
   }
}

class CreditCardPayment implements IPayment { // 1 mark
   public void pay() {
       System.out.println("CreditCard Payment made ");
   }
}

class ChequePayment implements IPayment { // 1 mark
   public void pay() {
       System.out.println("Cheque Payment made ");
   }
}

class MonthlyMode implements IMode { // 0.5 marks
   public void paymentMode() {
      System.out.println("Monthly Mode payment selected ");
   }
}

class FullMode implements IMode { // 0.5 marks
   public void paymentMode() {
       System.out.println("Full Mode payment selected ");
   }
}

class ShoppingCart {
   private IPayment payment;    // 0.5 x 2 = 1 mark
   private IMode mode;

   public void performPayment() {  // 1 mark
      payment.pay();
   } 
   public void performPaymentMode() {  // 1 mark
      mode.paymentMode();
   }
   void setPayment(IPayment payment) { // 1.5 marks
      this.payment = payment;
   }
   void setPaymentMode(IMode mode) { // 1.5 marks
      this.mode = mode;
   }
   void Display() {  // 2 marks (Another correct answer is any other approach where the
                     //  the details of the classes are printed
                      
      payment.pay();
      mode.paymentMode();
   }
}

class OnlineShoppingCart extends ShoppingCart {
   public OnlineShoppingCart() { 
      setPayment(new CreditCardPayment()); // 1 mark
      setPaymentMode(new MonthlyMode());  // 1 mark
   }
}

class MainApp {
   public static void main(String args[]) {
      ArrayList <OnlineShoppingCart> mlist = new ArrayList<OnlineShoppingCart>();

      // 1  mark for using either OnineShoppingCart or ShoppingCart class
      //   in defining an ArrayList
      OnlineShoppingCart o1 = new OnlineShoppingCart(); 
      OnlineShoppingCart o2 = new OnlineShoppingCart(); // 0.5 x 4 = 2 marks for creating Online ShoppingCarts or ShoppingCart classes
      OnlineShoppingCart o3 = new OnlineShoppingCart();
      OnlineShoppingCart o4 = new OnlineShoppingCart();
      o1.setPayment(new CashPayment()); 
      o1.setPaymentMode(new FullMode());  
      o2.setPayment(new ChequePayment());      // 0.25 x 8 = 2 marks for setting the objects either using setPayment(), setPaymentMode() or by using a constructor

      o2.setPaymentMode(new MonthlyMode()); // not needed (optional)
      o3.setPayment(new CreditCardPayment()); // not needed (optinal)
      o3.setPaymentMode(new MonthlyMode()); // note needed (optional)
      o4.setPayment(new ChequePayment());
      o4.setPaymentMode(new FullMode()); 
      mlist.add(o1);
      mlist.add(o2); // 0.25 x 4 = 1 mark
      mlist.add(o3);
      mlist.add(o4);


      for (OnlineShoppingCart var : mlist)
         var.Display();   // 1 mark
      
   }
}

