
public class HazardPay extends PayCalculator {
	
	public HazardPay(double newPayRate) {
		super();
		payRate = newPayRate;
	}
	
	@Override
	public double computePay(double hours) {
		return (1.5 * super.computePay(hours));
	}

}
