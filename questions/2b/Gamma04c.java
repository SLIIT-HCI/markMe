
class Calculation {
   private double sum = 0;
   public double getSum() {
      return sum;
   }
   public void ComputePowerSum(int no, int start, int end) {
      double msum = 0;

      for (int r = start; r <= end; r++) {
         double temp = 1;
         // can use temp = Math.pow(no, r); // as well
         for (int i = 1; i <= no; i++) {
            temp = temp * r;        
         }
         msum = msum + temp;  // correct calculation - 1 mark
      }
      synchronized (this) {  // synchronized used anywhere properly - 1 mark
         sum = sum + msum;
      }
      // Synchronized can be used for the entire code segment as well
   }

}

class ParallelThread extends Thread {
   private Calculation type;
   private int no;
   private int start;
   private int end;
 
   public ParallelThread(Calculation type, int no, int start, int end) {
      this.type = type;
      this.no = no;
      this.start = start;
      this.end = end;         // using constructor correctly 1 mark
   }
   public void run() {
      type.ComputePowerSum(no, start, end);   // proper method call 1 mark
   }
   
}

class MainThreadApp {
   public static void main(String args[]) {
      Calculation mycalc = new Calculation();  // 0.5 marks
      ParallelThread mthread1 = new ParallelThread(mycalc, 7, 1,10); // 0.5 marks
      ParallelThread mthread2 = new ParallelThread(mycalc, 7,11, 20); // 0.5 marks
      mthread1.start();  // 0.5 marks if both start() used correctly
      mthread2.start();

      try {
         mthread1.join();  // 0.5 marks
         mthread2.join();  // 0.5 marks
      } catch (InterruptedException e) {   // try catch - 0.5 marks
      }
      System.out.println("Ans is = " + mycalc.getSum()); // Ans = 1.1920928955078E14  // 0.5 marks
   }

}
