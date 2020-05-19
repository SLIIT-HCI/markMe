
import java.util.ArrayList;

abstract class Place {
   private String PlaceName;
   private String type;  // 3 x 0.5 marks = 1.5 marks
   private String address;

   
   public Place(String PlaceName, String type, String address) {
      this.PlaceName = PlaceName;
      this.type = type;     // 2 marks for the method
      this.address = address;
   }

   public void Show() {
      System.out.println("Place Name : " + PlaceName);
      System.out.println("Type        : " + type);  // 3 x 0.5 marks = 1.5 marks 
      System.out.println("Address     : " + address);
   }
}
   class Cinema extends Place {
       private int noOfparkingSlots;
       private int size;  // 3 x 0.5 marks = 1.5 marks
       private String loyaltyCard;

       public Cinema(String PlaceName, String address, int noOfparkingSlots, int size, String loyaltyCard) {
          super(PlaceName, "Cinema", address);  // 0.5 mark for proper super() call
          this.noOfparkingSlots = noOfparkingSlots;
          this.size = size;    // 3 x 0.5 marks = 1.5 marks
          this.loyaltyCard = loyaltyCard;
       }
       public void Show() {
          super.Show(); // 0.5 marks for super() call for Display()
          System.out.println("No of Parking slots   " + noOfparkingSlots);
          System.out.println("size                  " + size); // 1 mark for printing 3 properties
          System.out.println("Loyalty Card          " + loyaltyCard);
          System.out.println();
       }
   } 
  
   class MedicalCentre extends Centre {
       private boolean InWard;
       private boolean opd;  // 3 x 0.5 marks = 1.5 marks
       private boolean surgery;
    
       public MedicalCentre(String CentreName, String address, boolean InWard, boolean opd, boolean surgery) {
          super(PlaceName, "Medical", address);  // 0.5 mark for proper super() call
          this.InWard = InWard;
          this.opd = opd;   // 3 x 0.5 marks = 1.5 marks
          this.surgery = surgery;
       }
 
       public void Show() {
	       super.Show(); // 0.5 marks for calling super for Display()
          System.out.println("InWard                 " + InWard);
          System.out.println("Opd                    " + opd); // 1 mark for printing 3 properties
          System.out.println("Surgery                " + surgery);
          System.out.println();
       }

   }

   class MainApp {
       public static void main(String args[]) {
           ArrayList<Place> marr = new ArrayList<Centre>(); // 0.5 marks for ArrayList, 0.5 marks for using <Centre> correctly as a template
           marr.add(new MedicalCentre("Asiri", "Nawala", true, true, true)); 
           marr.add(new MedicalCentre("Sanhinda", "Kandy", false, true, false));
           marr.add(new Cinema("Savoy Wellawatte", "Wellawatte", 30, 10000, "HNB"));
           marr.add(new Cinema("Liberty Kolpity", "Kolpity", 20, 7000, "Standand Chartered"));
           // Array list add 4 x 0.25 marks = 1 mark
           // 4 objects correct 4 x 0.5 marks = 2 marks


           for (Place cent : marr)
              cent.Show();   // 1 mark for the for loop
       }
   }

        


