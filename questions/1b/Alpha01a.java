class CountUp implements Runnable {
   // implements Runnable - 1 mark
  public void run() {  // 0.5 marks run method,   0.5 marks run method
    for (int r=100; r<=105; r++) {
      try {  // try catch 1 mark
        System.out.println(r);
        Thread.sleep(1500);  // 1 mark
      } catch (InterruptedException e) {
      }
    }

  }
}
   //  1 mark
class TotalCalc extends Thread {
   public void run() {   // implementing run method = 1 mark
      double sum = 0;
      for (int r=100000; r<=200000; r++) {  
         sum += r; // calculating sum correctly 1 mark
      } 
      System.out.println(Thread.currentThread().getName() + " - " + sum);   // using Thread.currentThread().getName() - 1 mark
   }
}

class DemoAppThread {
   public static void main(String args[]) {
      Thread mcount = new Thread(new CountUp());
      TotalCalc thread1 = new TotalCalc();  // creating Thead 0.5 marks
      TotalCalc thread2 = new TotalCalc();
      thread1.setName("Red"); // 0.5 mark
      thread2.setName("Green");  // 0.5 mark

      mcount.start(); 
      try {  // 0.5 mark
         mcount.join();  // 1 mark
      } catch(InterruptedException e) {
      }
      
      thread1.start();  // 0.5 mark
      thread2.start();  // 0.5 mark
      // Should show 1.500015E10            
   }
}

