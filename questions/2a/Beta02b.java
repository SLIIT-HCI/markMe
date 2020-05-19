class Shared {
   // 1 mark for shared object
}

// a thread for implement wait - 1 mark
class WaitThread extends Thread {
   Shared obj;

   public WaitThread(Shared obj) {
     this.obj = obj;
   }
   public void run() {
     // print 10 numbers
      synchronized (obj) { // 0.5 marks for syncrhonized
         try {
             for (int r=1; r<=10; r++)
                 System.out.println(r);
             System.out.println("Wait....");
             // wait till other process is over
             obj.wait();  // 0.5 mark for notify
         } catch (InterruptedException e) {
         }
         // Continue to print these messages
         System.out.println("Printing these values after at the end");
         // lets print 10 to 1
         for (int r=10; r>= 1; r--)
              System.out.println(r);
      }
   }
}

// 1 mark for Notify class
class NotifyThread extends Thread {
   Shared obj;

   public NotifyThread(Shared obj) {
      this.obj = obj;
   }
   public void run() {
      synchronized(obj) { // 0.5 mark for synchronized

         for (int r=100; r>=1; r--)
            System.out.print(r + " ");

         obj.notify();   // 0.5 marks
  
      }
   }
}

class Demo {

    public static void main(String args[]) {
        Shared mobj = new Shared();

        WaitThread thread1 = new WaitThread(mobj);
        NotifyThread thread2 = new NotifyThread(mobj);

        thread1.start();
        thread2.start();
     }
}

