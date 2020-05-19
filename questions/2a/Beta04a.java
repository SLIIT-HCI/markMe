
class SecurityDoorValidator {
    private static SecurityDoorValidator unique; // 0.5 marks

    private SecurityDoorValidator() {} // 1 mark

    // 0.5 mark
    public static SecurityDoorValidator getInstance() {
        if (unique == null) // 0.5 mark
           unique = new SecurityDoorValidator(); // 1 mark

        return unique; // 0.5 marks
    }

    public boolean validateDoorPin(int pin) {
       if (pin % 97 == 0)  // 1 marks
          return true;
       else
          return false;
    }
}

class DemoApp {
   public static void main(String args[]) {
      SecurityDoorValidator obj1 = SecurityDoorValidator.getInstance(); // 1 mark
      SecurityDoorValidator obj2 = SecurityDoorValidator.getInstance();

      System.out.println(obj1.validateDoorPin(50)); // 1 mark
      System.out.println(obj1.validateDoorPin(97*3));
  
      if (obj1 == obj2) // 1 mark
         System.out.println("objects are equal");
      else
         System.out.println("They are two seperate objects");

   }
}
