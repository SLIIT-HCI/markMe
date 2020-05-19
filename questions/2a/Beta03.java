import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

// class extending Exception - 1.5 mark
class InsufficentItemsException extends Exception {
    private int qty;  // 0.5 marks
    public InsufficentItemsException(int qty) {
       this.qty = qty; // 2 marks
    }
    public int getQty() {
       return qty;  // 1 mark
    }
}

class SuperMarket {
   private int qtyInHand[]; // 2 marks
   public SuperMarket() {
      qtyInHand = new int[10];
      for (int r=0; r<10; r++)  // 2 marks
         qtyInHand[r] = 0;
   }

   // method declaration 1 mark
   public void addItem(int itemNo, int amount) {
      qtyInHand[itemNo] += amount;  // 2 marks
   }

   // method declaration 1 mark
   public void sellItems(int itemNo, int amount) throws InsufficentItemsException {
  
      if (amount > qtyInHand[itemNo]) // if condition 1 mark
         throw new InsufficentItemsException(amount); // throwing exception 1 mark

      qtyInHand[itemNo] -= amount; // 1 mark
   } 
}

class MainApp {
   public static void main(String args[]) {
      SuperMarket cargills = new SuperMarket(); // 0.5 marks
      cargills.addItem(5, 1000);
      cargills.addItem(7, 2000); // 1 mark
      cargills.addItem(2, 4000);

      int itemNo, amount;

      for (int r=1; r<=3; r++) {
           Scanner keyboard = new Scanner(System.in);
           
           try {

              System.out.print("Enter ItemNo : ");
              itemNo = keyboard.nextInt();     // keyboard input 1 mark
              System.out.print("Enter amount to sell : ");
              amount = keyboard.nextInt();

              cargills.sellItems(itemNo, amount);

           } catch (InputMismatchException e) { // 1 mark
                 System.out.println("ItemNo and Amounts should be integers");
           } 
             catch (InsufficentItemsException e) {  // 1 mark
                 System.out.println("qty " + e.getQty() + " exceeds existing stocks");
             }
       }

       HashMap data = new HashMap();  // 1 mark
       data.put(3, 1000);
       data.put(7, 2000); // 1.5 marks
       data.put(2, 4000);

       System.out.println(data.get(3));
       System.out.println(data.get(7)); // 1.5 marks
       System.out.println(data.get(2));
   }
}
