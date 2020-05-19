package beta02c;

public class ParallelThread extends Thread{

	Calculation mycalc;
	private int no;
	private int start;
	private int end;
	
	public ParallelThread(Calculation mycalc, int no, int start, int end) {
	
		this.mycalc = mycalc;
		this.no = no;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(mycalc){
			mycalc.ComputePowerSum(no, start, end);
		}
	}
	
	
	
	
}
