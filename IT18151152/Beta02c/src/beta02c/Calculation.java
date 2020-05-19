package beta02c;

public class Calculation {

	public double sum = 1;

	public double getSum() {
		return sum;
	}
	
	public void ComputePowerSum(int no, int start, int end){
		for(int i=start; i<=end; i++){
			double power = no*no;
			sum += power;
		}
		System.out.println("powersum is " +sum);
	}
	
}
