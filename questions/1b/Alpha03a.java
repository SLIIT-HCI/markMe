
class UniqueSingleton {
    private static UniqueSingleton unique;  // 0.5 marks

    private UniqueSingleton() {}  // 1 mark

    public static UniqueSingleton getInstance() {
        
        if (unique == null) {  // 0.5 mark
           synchronized (UniqueSingleton.class) { // 1 mark
               if (unique == null) // 0.5 mark
                   unique = new UniqueSingleton(); // 0.5 mark
           }

        }
        return unique; // 0.5 mark
    }
}

class DemoApp {
   public static void main(String args[]) {
      UniqueSingleton obj1 = UniqueSingleton.getInstance(); // 1 mark
      UniqueSingleton obj2 = UniqueSingleton.getInstance(); // 1 mark
 
      if (obj1 == obj2)  // 0.5 mark
         System.out.println("objects are equal");
      else
         System.out.println("They are two seperate objects");

   }
}
