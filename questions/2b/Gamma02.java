import java.util.ArrayList;
import java.util.Collection;

interface IShow {
   void showMain(); // 1 mark
   void list(); // 1 mark
}

// abstract class - 0.5 marks, IShow interface - 0.5 marks
abstract class SuperHero implements IShow {
   private String name;
   private String keySuperPower;   // 1 mark
   private String[] otherPowers;

   public SuperHero(String name, String keySuperPower, String[] otherPowers) {
      this.name = name;
      this.keySuperPower = keySuperPower;  // 1 mark
      this.otherPowers = otherPowers;
   }

   public void showMain() {
      System.out.println(name + "'s main super power "   // 1 mark
              + keySuperPower);
   }
   public void list() {
      System.out.println("Other Superpowers ");
      System.out.println("================  ");
      for (int r = 0; r < otherPowers.length; r++) // 1 mark
          System.out.println(otherPowers[r]);
   }
}

// Extends - 0.5 marks 
class Spiderman extends SuperHero {
   private String weakness;  // 0.5 marks
   public Spiderman(String mainPower, String[] otherPowers, String weakness) {
      super("Spiderman", mainPower, otherPowers);  // 1 mark
      this.weakness = weakness; // rest of the constructor 1 mark
   }
}

class Ironman extends SuperHero {
   public Ironman() { 
      super("Ironman", "None", new String[] {"None"});   // handling string [] - 1 mark
      // Another approach is                          // rest of constructor - 1 mark
      // String data[] = new String[1];
      // data[0] = "None";
      // data is passed a parameter
   }
}

class Item implements IShow {
   private int itemNo;
   private String description;  // 1 mark
   private float unitPrice;

   public Item(int itemNo, String description, int unitPrice) {
      this.itemNo = itemNo;
      this.description = description;  // 1 mark
      this.unitPrice = unitPrice;
   }
   public void showMain() {
      System.out.println("Key is : " + itemNo);  // 0.5 marks
   }
   public void list() {
      System.out.println("Title  : " + description);  // 0.5 marks
      System.out.println("Unit Price : " + unitPrice);
   }
}

class Demo {
  public static void main(String args[]) {
     Collection<IShow> mylist = new ArrayList<IShow>(); // 1 mark
                    // An collection object can be later assigned to an ArrayList as well
                    // Using <IShow> to restrict data - 0.5 marks

     String[] mstrArr = new String[4];
     mstrArr[0] = "Walk on Walls";
     mstrArr[1] = "Super sensitive ears";
     mstrArr[2] = "Speed";  // using string correctly for Spiderman - 0.5 mark
     mylist.add(new Ironman()); // 0.5 marks
     mylist.add(new Item(1111, "Game of Thrones", 1300)); // 0.5 marks
     mylist.add(new Item(1112, "Hunger Games",1200)); // 0.5 marks
     mylist.add(new Spiderman("Web Spinning", mstrArr, "girl friend")); // 0.5 marks
     for (IShow mitem : mylist) {
         mitem.showMain();   // 1 mark
         mitem.list();
     }  
  }
}
