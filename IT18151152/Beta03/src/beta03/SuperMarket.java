package beta03;

import java.util.ArrayList;

public class SuperMarket {

	ArrayList<Integer> qtyInHand[] =  new ArrayList<>();

	public SuperMarket(ArrayList<Integer>[] qtyInHand) {
		super();
		this.qtyInHand = qtyInHand;
	}
	
	public void addItem(int itemNo, int amount){
		System.out.println("Item number: "+qtyInHand);
		System.out.println("amount of books added: "+amount);
	}
	
	public void sellItems(int itemNo, int amount) throws InsufficientItemsException{
		System.out.println("Item number: "+qtyInHand);
		System.out.println("amount of books to be sold: "+amount);
	}
}
