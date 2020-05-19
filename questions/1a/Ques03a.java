
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;


class MainApp {
   public static void main(String args[]) {
      double b,c;
      int a;
      double  ans1, ans2;

      Scanner key = new Scanner(System.in);

      try {
         System.out.print("Enter a : ");
         a = key.nextInt();
         System.out.print("Enter b : ");
         b = key.nextInt();
         System.out.print("Enter c : ");
         c = key.nextInt();
         // keyboard inputs correct including defining Scanner class
         // = 1 marks

         if (a == 0)
           throw new ArithmeticException();

         ans1 = (-b + Math.sqrt(b*b + 4*a*c))/(2*a); // 1 mark   
         ans2 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a); // 1 mark 
         System.out.println("answers = " + ans1 + " and " + ans2);  

      } catch (InputMismatchException e) {
          // 1.5 marks for correct InputMisMatchException
          System.out.println("You need to enter an integer for a, b, c");
      } catch (ArithmeticException e) {
           // 1.5 marks for either using Arithmetic Exception directly or 
           // throwing an exception for a == 0 and catching it
           // (for this question we will give 1.5 for just calling the ArithmeticException 
           //   although it doesn't catch division by zero)
          System.out.println("a cannot be zero");
      }
   } 

}
