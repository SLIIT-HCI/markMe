package beta02b;

public class Threadtwo extends Thread{

	public Threadtwo(){}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(Threadtwo.class){
			System.out.println("Thread two running");
			
		}
	
	}
}
