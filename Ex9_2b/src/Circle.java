
public class Circle extends Shape{
	private double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return "Radius: " + getRadius();
	}
	
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Circle))
			return false;
		Circle otherCircle = (Circle)otherObject;
		return this.radius == otherCircle.radius;
	}

}
