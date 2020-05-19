package beta02a;

public class MainAppThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread c = new Thread(new Count());
		
		Thread d1 = new Thread(new DisplayNames());
		Thread d2 = new Thread(new DisplayNames());
		
		
		
		d1.setName("Moon");
		d2.setName("Sun");
		
		c.start();
		c.join();
		
		d1.start();
		d1.join();
		d2.start();
		d2.join();
		
	}

}
