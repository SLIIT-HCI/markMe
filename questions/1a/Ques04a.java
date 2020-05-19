
class SLIITSingleton {
    private static SLIITSingleton unique;  // 0.5 marks

    private SLIITSingleton() {}  // 1 mark

    public static SLIITSingleton getInstance() {
        
        if (unique == null) {  // 0.5 mark
           synchronized (SLIITSingleton.class) { // 1 mark
               if (unique == null) // 0.5 mark
                   unique = new SLIITSingleton(); // 0.5 mark
           }

        }
        return unique; // 0.5 mark
    }
}

class DemoApp {
   public static void main(String args[]) {
      SLIITSingleton obj1 = SLIITSingleton.getInstance(); // 1 mark
      SLIITSingleton obj2 = SLIITSingleton.getInstance(); // 1 mark
 
      if (obj1 == obj2)  // 0.5 mark
         System.out.println("objects are equal");
      else
         System.out.println("They are two seperate objects");

   }
}
