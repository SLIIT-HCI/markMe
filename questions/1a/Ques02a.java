#class CountDown implements Runnable {
   // Implements Runnable Interface - 1 mark
  public void run() {  // run method - 0.5 marks
    for (int r=5; r>=1; r--) { // for loop - 0.5 mark 
      try {  // try catch 1 mark
        System.out.println(r);
        Thread.sleep(2000);  // 1 mark
      } catch (InterruptedException e) {
      }
    }

  }
}

// Runnable extends Thread class = 1 mark
#class SumCalc extends Thread {
   public void run() {   // run() method = 1 mark
      double sum = 0;
      for (int r=1; r<=100000; r++) { // for loop and calculation correct  = 1 mark  
         sum += r;  
      } 
      System.out.println(Thread.currentThread().getName() + " - " + sum);   // using Thread.currentThread().getName() - 1 mark
   }
}

#class MainAppThread {
   public static void main(String args[]) {
      Thread mcount = new Thread(new CountDown());
      SumCalc thread1 = new SumCalc();  // creating Thead 0.5 marks
      SumCalc thread2 = new SumCalc();
      thread1.setName("Purple"); // 0.5 mark
      thread2.setName("Yellow");  // 0.5 mark

      mcount.start(); 
      try {  // 0.5 mark
         mcount.join();  // 1 mark
      } catch(InterruptedException e) {
      }
      
      thread1.start();  // 0.5 mark
      thread2.start();  // 0.5 mark
      // Should show 5000050000            
   }
}

