import java.util.ArrayList;

// Defining <T extends Number> correctly = 1.5 Mark
// Defining the class TCalculation = 0.5 marks
class TCalculation<T extends Number>  {
   private ArrayList<T> numList = new ArrayList<T>();  // ArrayList correctly defined - 1 Mark

   void append(T val) {  // Defining the method correctly = 2 marks
      numList.add(val);  // using hte add method correctly = 2 marks
   } 

   double average() {  // Method 1 marks
      double sum = 0;
      for (T val : numList)  // For loop correctly = 2 marks
         sum += val.doubleValue();  // doubleValue() method = 2 marks
      return sum;  // Correct calculation of sum = 1 mark
   }

}

class MainApp {
   public static void main(String args[]) {
      TCalculation<Integer> myints = new TCalculation<Integer>(); // 1.5 mark
      TCalculation<Double> mydbls = new TCalculation<Double>(); // 1.5 mark
      myints.append(100);
      myints.append(200);
      myints.append(300);  // 1 marks for using append correct
      myints.append(400);
      myints.append(500);

      mydbls.append(156.3);
      mydbls.append(178.5); // 1 mark for using append correct
      mydbls.append(123.9);
      System.out.println("Avg of integers " + myints.average()); // 0.5 marks
      System.out.println("Avg of Double " + mydbls.average()); // 0.5 marks
   }
}
