import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
import java.lang.*;

// class extending Exception - 1.5 mark
class NoStocksException extends Exception {
    private int qty;  // 0.5 marks
    public NoStocksException(int qty) {
       this.qty = qty; // 2 marks
    }
    public int getQty() {
       return qty;  // 1 mark
    }
}

class Hardware {
   private int stocks[]; // 2 marks
   public Hardware() {
      stocks = new int[10];
      for (int r=0; r<10; r++)  // 2 marks
         stocks[r] = 0;
   }

   // method declaration 1 mark
   public void appendItem(int itemNo, int amount) {
      stocks[itemNo] += amount;  // 2 marks
   }

   // method declaration 1 mark
   public void sellItems(int itemNo, int amount) throws NoStocksException {
  
      if (amount > stocks[itemNo]) // if condition 1 mark
         throw new NoStocksException(amount); // throwing exception 1 mark

      stocks[itemNo] -= amount; // 1 mark
   } 
}

class MainApp {
   public static void main(String args[]) {
      Hardware sunilhardware = new Hardware(); // 0.5 marks
      sunilhardware.appendItem(5, 1000);
      sunilhardware.appendItem(7, 2000); // 1 mark
      sunilhardware.appendItem(2, 4000);

      int itemNo, amount;

      for (int r=1; r<=3; r++) {
           Scanner keyboard = new Scanner(System.in);
           
           try {

              System.out.print("Enter ItemNo : ");
              itemNo = keyboard.nextInt();     // keyboard input 1 mark
              System.out.print("Enter amount to sell : ");
              amount = keyboard.nextInt();

              sunilhardware.sellItems(itemNo, amount);

           } catch (ArrayIndexOutOfBoundsException e) { // 1 mark
                 System.out.println("Index out of bounds");
           } 
             catch (NoStocksException e) {  // 1 mark
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
