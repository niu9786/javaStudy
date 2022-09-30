
public class Main {

	public static void main(String[] args) {
		
		Shape[] f = new Shape[] { new Rectangle(10, 3), new RightTriangle(9, 6), new Circle(4)};
		
		System.out.println(f[0].toString());
		System.out.println(f[1].toString());
		System.out.println(f[2].toString());
		
		System.out.println(f[0].getArea());
		System.out.println(f[1].getArea());
		System.out.println(f[2].getArea());
		
		Rectangle B = new Rectangle(8, 4);
		RightTriangle C = new RightTriangle(9,6);
		
		System.out.println(f[0].equals(B));
		System.out.println(f[1].equals(C));
		System.out.println(f[2].equals(C));

	}

}
