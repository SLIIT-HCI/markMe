import java.util.ArrayList;
import java.util.Collection;

#interface IShow {
   void showKey(); // 1 mark
   void list(); // 1 mark
}

// abstract class - 0.5 marks, IShow interface - 0.5 marks
#abstract class SuperHero implements IShow {
   private String name;
   private String mainSuperPower;   // 1 mark
   private String[] otherPowers;

   public SuperHero(String name, String mainSuperPower, String[] otherPowers) {
      this.name = name;
      this.mainSuperPower = mainSuperPower;  // 1 mark
      this.otherPowers = otherPowers;
   }

   public void showKey() {
      System.out.println(name + "'s main super power "   // 1 mark
              + mainSuperPower);
   }
   public void list() {
      System.out.println("Other Superpowers ");
      System.out.println("================  ");
      for (int r = 0; r < otherPowers.length; r++) // 1 mark
          System.out.println(otherPowers[r]);
   }
}

// Extends - 0.5 marks 
#class Superman extends SuperHero {
   private String weakness;  // 0.5 marks
   public Superman(String mainPower, String[] otherPowers, String weakness) {
      super("Superman", mainPower, otherPowers);  // 1 mark
      this.weakness = weakness; // rest of the constructor 1 mark
   }
}

#class Batman extends SuperHero {
   public Batman() { 
      super("Batman", "None", new String[] {"None"});   // handling string [] - 1 mark
      // Another approach is                          // rest of constructor - 1 mark
      // String data[] = new String[1];
      // data[0] = "None";
      // data is passed a parameter
   }
}

#class Book implements IShow {
   private int isbnNo;
   private String title;  // 1 mark
   private String author;

   public Book(int isbnNo, String title, String author) {
      this.isbnNo = isbnNo;
      this.title = title;  // 1 mark
      this.author = author;
   }
   public void showKey() {
      System.out.println("Key is : " + isbnNo);  // 0.5 marks
   }
   public void list() {
      System.out.println("Title  : " + title);  // 0.5 marks
      System.out.println("Author : " + author);
   }
}

#class Demo {
  public static void main(String args[]) {
     Collection<IShow> mylist = new ArrayList<IShow>(); // 1 mark
                    // An collection object can be later assigned to an ArrayList as well
                    // Using <IShow> to restrict data - 0.5 marks

     String[] mstrArr = new String[4];
     mstrArr[0] = "Superhuman Strength";
     mstrArr[1] = "X-Ray Vision";
     mstrArr[2] = "Laser Vision";  // using string correctly for Superman - 0.5 mark
     mstrArr[3] = "Super Speed";
     mylist.add(new Batman()); // 0.5 marks
     mylist.add(new Book(1111, "Game of Thrones", "George RR Martin")); // 0.5 marks
     mylist.add(new Book(1112, "Hunger Games","Suzanne Collins")); // 0.5 marks
     mylist.add(new Superman("Flying", mstrArr, "kryptonite")); // 0.5 marks
     for (IShow mitem : mylist) {
         mitem.showKey();   // 1 mark
         mitem.list();
     }  
  }
}
