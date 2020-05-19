package beta02c;

public class MainThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation c = new Calculation();
		
		Thread th1 = new Thread(new ParallelThread(c, 5, 1, 10));
		
		Thread th2 = new Thread(new ParallelThread(c, 5, 10, 20));
		
		System.out.println("Sum is : " +c);
	}

}
