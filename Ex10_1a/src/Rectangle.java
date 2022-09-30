
public class Rectangle extends Shape{
	private double height, width = 0;
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return this.height * this.width;
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
		if (!(otherObject != null && otherObject instanceof Rectangle))
			return false;
		Rectangle otherRectangle = (Rectangle)otherObject;
		return (this.height == otherRectangle.height) &&
				(this.width == otherRectangle.width);
	}

}
