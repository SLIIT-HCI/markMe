package beta02a;

import java.util.ArrayList;

public class DisplayNames implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(DisplayNames.class){
			 ArrayList<String> list = new ArrayList<>();
			 
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 list.add("john");
			 
			 for(String i: list){
				 System.out.println("Name: " +i);
				 System.out.println(Thread.currentThread().getName());
			 }
			 
		}
		
	}

	
}
