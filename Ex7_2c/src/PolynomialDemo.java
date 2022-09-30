
public class PolynomialDemo {

	public static void main(String[] args) {
		Polynomial ex1 = new Polynomial(3);
		ex1.setConstant(0, 3);
		ex1.setConstant(1, 5);
		ex1.setConstant(3, 2);
		
		System.out.println(ex1.evaluate(5));
		System.out.println(ex1.evaluate(7));
		
		Polynomial ex2 = new Polynomial(4);
		ex2.setConstant(0, 2);
		ex2.setConstant(1, 5);
		ex2.setConstant(2, 4);
		ex2.setConstant(3, 1);
		ex2.setConstant(4, 2);
		
		System.out.println(ex2.evaluate(2));
		System.out.println(ex2.evaluate(6));

	}

}
