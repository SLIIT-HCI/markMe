package beta02a;

public class Count extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(Count.class){
			for(int i=1; i<=5; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(i);
			}
		}
	}

	
}
