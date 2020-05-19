import java.util.ArrayList;

interface IPay { // 1 mark
   void pay();
}

interface IMode { // 1 mark
   void paymentMode();
}

class CashPayment implements IPay { // 1 mark
   public void pay() {
       System.out.println("Cash Payment made ");
   }
}

class CreditCardPayment implements IPay { // 1 mark
   public void pay() {
       System.out.println("CreditCard Payment made ");
   }
}

class ChequePayment implements IPay { // 1 mark
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

class OrderCart {
   private IPay payment;    // 0.5 x 2 = 1 mark
   private IMode mode;

   public void performPayment() {  // 1 mark
      payment.pay();
   } 
   public void performPaymentMode() {  // 1 mark
      mode.paymentMode();
   }
   void setPayment(IPay payment) { // 1.5 marks
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

class OnlineOrderCart extends OrderCart {
   public OnlineOrderCart() { 
      setPayment(new CreditCardPayment()); // 1 mark
      setPaymentMode(new MonthlyMode());  // 1 mark
   }
}

class DemoApp {
   public static void main(String args[]) {
      ArrayList <OnlineOrderCart> mlist = new ArrayList<OnlineOrderCart>();

      // 1  mark for using either OnineOrderCart or ShoppingCart class
      //   in defining an ArrayList
      OnlineOrderCart o1 = new OnlineOrderCart(); 
      OnlineOrderCart o2 = new OnlineOrderCart(); // 0.5 x 4 = 2 marks for creating Online ShoppingCarts or ShoppingCart classes
      OnlineOrderCart o3 = new OnlineOrderCart();
      OnlineOrderCart o4 = new OnlineOrderCart();
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


      for (OnlineOrderCart var : mlist)
         var.Display();   // 1 mark
      
   }
}

