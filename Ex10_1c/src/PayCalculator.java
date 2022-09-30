
public abstract class PayCalculator {
	
	public double payRate = 0;
	
	public double computePay(double hours) {
		return payRate * hours;
	}

}
