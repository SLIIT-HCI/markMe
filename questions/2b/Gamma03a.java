
class DebitCardValidator {
    private static DebitCardValidator unique; // 0.5 marks

    private DebitCardValidator() {} // 1 mark

    // 0.5 mark
    public static DebitCardValidator getInstance() {
        if (unique == null) // 0.5 mark
           unique = new DebitCardValidator(); // 1 mark

        return unique; // 0.5 marks
    }

    public boolean validateDebitCard(int pin) {
       if (pin % 17 == 0)  // 1 marks
          return true;
       else
          return false;
    }
}

class DemoApp {
   public static void main(String args[]) {
      DebitCardValidator obj1 = DebitCardValidator.getInstance(); // 1 mark
      DebitCardValidator obj2 = DebitCardValidator.getInstance();

      System.out.println(obj1.validateDebitCard(50)); // 1 mark
      System.out.println(obj1.validateDebitCard(17*3));
  
      if (obj1 == obj2) // 1 mark
         System.out.println("objects are equal");
      else
         System.out.println("They are two seperate objects");

   }
}
