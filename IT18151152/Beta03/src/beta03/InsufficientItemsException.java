package beta03;

public class InsufficientItemsException extends Exception{

	private int qty;

	public InsufficientItemsException(int qty) {
		super();
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}
	
	
}
