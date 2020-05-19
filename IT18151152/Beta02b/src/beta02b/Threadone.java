package beta02b;

public class Threadone extends Thread{

	public Threadone(){}
	
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		synchronized(Threadtwo.class){
		System.out.println("Thread one running");
		
	}
	
	}

}
