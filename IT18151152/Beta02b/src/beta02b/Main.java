package beta02b;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 =  new Thread(new Threadone());
		Thread t2 =  new Thread(new Threadtwo());
		
		t1.start();
		t2.start();
		
		
	}

}
