
public class Temperature {
	private float degree = 0;
	private char scale;
	
	public Temperature(float degree) {
		this.degree = degree;
	}
	
	public Temperature(char scale) {
		this.scale = scale;
	}
	
	public Temperature(float degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
	
	public Temperature() {
		this.degree = 0;
		this.scale = 0;
	}
	
	public float getDegreeC() {
		float result=0;
		
		if (this.scale == 'C') {
			result = this.degree;
		}
		else if (this.scale == 'F') {
			result = (5 * (this.degree - 32) / 9);
		}
		
		String resultStr = String.format("%.1f", result);
		
		result = Float.parseFloat(resultStr);
		
		return result;
	}
	
	public float getDegreeF() {
		float result=0;
		
		if (this.scale == 'F') {
			result = this.degree;
		}
		else if (this.scale == 'C') {
			result = (9 * this.degree / 5) + 32;
		}
		
		String resultStr = String.format("%.1f", result);
		
		result = Float.parseFloat(resultStr);
		
		return result;
	}
	
	public void setDegree(float degree) {
		this.degree = degree;
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public void setDegreeScale(float degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
	
	public boolean equals(Temperature otherObject) {
		if ((this.scale == 'F') && (otherObject.scale == 'C')) {
			return (this.degree == ((9 * otherObject.degree / 5) + 32));
		}
		else if ((this.scale == 'C') && (otherObject.scale == 'F')) {
			return (this.degree == (5 * (otherObject.degree - 32) / 9));
		}
		else {
			return (this.degree == otherObject.degree);
		}
	}
	
	public boolean compareGreater(Temperature otherObject) {
		
		if ((this.scale == 'F') && (otherObject.scale == 'C')) {
			return (this.degree > ((9 * otherObject.degree / 5) + 32));
		}
		else if ((this.scale == 'C') && (otherObject.scale == 'F')) {
			return (this.degree > (5 * (otherObject.degree - 32) / 9));
		}
		else {
			return (this.degree > otherObject.degree);
		}
	}
	
	public boolean compareLess(Temperature otherObject) {
		
		if ((this.scale == 'F') && (otherObject.scale == 'C')) {
			return (this.degree < ((9 * otherObject.degree / 5) + 32));
		}
		else if ((this.scale == 'C') && (otherObject.scale == 'F')) {
			return (this.degree < (5 * (otherObject.degree - 32) / 9));
		}
		else {
			return (this.degree < otherObject.degree);
		}
	}
	
}
