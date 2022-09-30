
public class RightTriangle extends Shape {
	private double height, width = 0;
	
	public RightTriangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return (this.height * this.width) / 2;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String toString() {
		return "height: " + getHeight() +
				" width: " + getWidth();
	}
	
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof RightTriangle))
			return false;
		RightTriangle otherRightTriangle = (RightTriangle)otherObject;
		return (this.height == otherRightTriangle.height) &&
				(this.width == otherRightTriangle.width);
	}

}
