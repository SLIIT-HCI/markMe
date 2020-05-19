class Count extends Thread {
   // extends Thread - 1 mark
  public void run() {  // 0.5 marks run method,   0.5 marks run method
    for (int r=1; r<=5; r++) {
      try {  // try catch 1 mark
        System.out.println(r);
        Thread.sleep(1000);  // 1 mark
      } catch (InterruptedException e) {
      }
    }

  }
}
          // Runnable interface 1 mark
class DisplayNames implements Runnable {
   public void run() {   // String Array - 2
      String[] names = new String[]  {"Amali", "Banuka",
      "Chithra", "Duminda","Eishwari", "Felix", "Gimhana", "Helani",
     "Indika", "Kulatunga"};
      // can assign these seperatly as well
      for (int r=0; r<10; r++) {  
          System.out.println(Thread.currentThread().getName() + " - " + names[r]);   // using Thread.currentThread().getName() - 1 mark
      }

   }
}

class MainAppThread {
   public static void main(String args[]) {
      Count mcount = new Count();
      Thread thread1 = new Thread(new DisplayNames());  // creating Thead 0.5 marks
      Thread thread2 = new Thread(new DisplayNames());
      thread1.setName("Moon"); // 0.5 mark
      thread2.setName("Sun");  // 0.5 mark

      mcount.start(); 
      try {  // 0.5 mark
         mcount.join();  // 1 mark
      } catch(InterruptedException e) {
      }
      
      thread1.start();  // 0.5 mark
      thread2.start();  // 0.5 mark
      
   }
}
