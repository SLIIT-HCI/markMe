class CountDown extends Thread {
   // extends Thread - 1 mark
  public void run() {  // 0.5 marks run method,   0.5 marks run method
    for (int r=5; r>=1; r--) {
      try {  // try catch 1 mark
        System.out.println(r);
        Thread.sleep(1000);  // 1 mark
      } catch (InterruptedException e) {
      }
    }

  }
}
          // Runnable interface 1 mark
class DisplayCities implements Runnable {
   public void run() {   // String Array - 2
      String[] names = new String[]  {"Anurdhapura", "Badulla", "Colombo", "Dambulla","Ella","Ferguson", "Gotatuwa", "Hedala","Ingiriya","Kaluthara"};
      // can assign these seperatly as well
      for (int r=0; r<10; r++) {  
          System.out.println(Thread.currentThread().getName() + " - " + names[r]);   // using Thread.currentThread().getName() - 1 mark
      }

   }
}

class MainAppThread {
   public static void main(String args[]) {
      CountDown mcount = new CountDown();
      Thread thread1 = new Thread(new DisplayCities());  // creating Thead 0.5 marks
      Thread thread2 = new Thread(new DisplayCities());
      thread1.setName("Rain"); // 0.5 mark
      thread2.setName("Snow");  // 0.5 mark

      mcount.start(); 
      try {  // 0.5 mark
         mcount.join();  // 1 mark
      } catch(InterruptedException e) {
      }
      
      thread1.start();  // 0.5 mark
      thread2.start();  // 0.5 mark
      
   }
}
