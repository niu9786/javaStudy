
public class PayCalculatorDemo {

	public static void main(String[] args) {
		RegularPay A = new RegularPay(4.2);
		
		HazardPay B = new HazardPay(8);
		
		System.out.println(A.computePay(2));
		System.out.println(B.computePay(2));

	}

}
