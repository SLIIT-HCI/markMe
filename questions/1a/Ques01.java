
import java.util.ArrayList;

#abstract class Centre {
   private String CentreName;
   private String type;  // 3 x 0.5 marks = 1.5 marks
   private String address;

   
   public Centre(String CentreName, String type, String address) {
      this.CentreName = CentreName;
      this.type = type;     // 2 marks for the method
      this.address = address;
   }

   public void Display() {
      System.out.println("Centre Name : " + CentreName);
      System.out.println("Type        : " + type);  // 3 x 0.5 marks = 1.5 marks 
      System.out.println("Address     : " + address);
   }
}
   #class Supermarket extends Centre {
       private int noOfparkingSlots;
       private int size;  // 3 x 0.5 marks = 1.5 marks
       private String loyaltyCard;

       public Supermarket(String CentreName, String address, int noOfparkingSlots, int size, String loyaltyCard) {
          super(CentreName, "SuperMarket", address);  // 0.5 mark for proper super() call
          this.noOfparkingSlots = noOfparkingSlots;
          this.size = size;    // 3 x 0.5 marks = 1.5 marks
          this.loyaltyCard = loyaltyCard;
       }
       public void Display() {
          super.Display(); // 0.5 marks for super() call for Display()
          System.out.println("No of Parking slots   " + noOfparkingSlots);
          System.out.println("size                  " + size); // 1 mark for printing 3 properties
          System.out.println("Loyalty Card          " + loyaltyCard);
          System.out.println();
       }
   } 
  
   #class MedicalCentre extends Centre {
       private boolean InWard;
       private boolean opd;  // 3 x 0.5 marks = 1.5 marks
       private boolean surgery;
    
       public MedicalCentre(String CentreName, String address, boolean InWard, boolean opd, boolean surgery) {
          super(CentreName, "Medical", address);  // 0.5 mark for proper super() call
          this.InWard = InWard;
          this.opd = opd;   // 3 x 0.5 marks = 1.5 marks
          this.surgery = surgery;
       }
 
       public void Display() {
	       super.Display(); // 0.5 marks for calling super for Display()
          System.out.println("InWard                 " + InWard);
          System.out.println("Opd                    " + opd); // 1 mark for printing 3 properties
          System.out.println("Surgery                " + surgery);
          System.out.println();
       }

   }

   #class MainApp {
       public static void main(String args[]) {
           ArrayList<Centre> marr = new ArrayList<Centre>(); // 0.5 marks for ArrayList, 0.5 marks for using <Centre> correctly as a template
           marr.add(new MedicalCentre("Asiri", "Nawala", true, true, true)); 
           marr.add(new MedicalCentre("Sanhinda", "Kandy", false, true, false));
           marr.add(new Supermarket("Keels Borella", "Borella", 30, 10000, "Nexus"));
           marr.add(new Supermarket("Cargills Kandy", "Kandy", 20, 7000, "Cargills"));
           // Array list add 4 x 0.25 marks = 1 mark
           // 4 objects correct 4 x 0.5 marks = 2 marks


           for (Centre cent : marr)
              cent.Display();   // 1 mark for the for loop
       }
   }

        


