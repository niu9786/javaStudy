
public class Polynomial {
	private int n = 0; // degree
	private double[] coefficients = null;
	
	public Polynomial(int max) {
		this.n = (max + 1);
		this.coefficients = new double[this.n];
		for (int i = 0; i < this.n; i++) {
			this.coefficients[i] = 0;
		}
	}
	
	public void setConstant(int i, double value) {
		this.coefficients[i] = value;
	}
	
	public double evaluate(double x) {
		double result = 0;;
		for (int i = 0; i < this.coefficients.length; i ++) {
			result = result + (this.coefficients[i] * Math.pow(x, i));
		}
		return result;
	}

}
