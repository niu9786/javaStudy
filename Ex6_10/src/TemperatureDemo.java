
public class TemperatureDemo {

	public static void main(String[] args) {
		Temperature A = new Temperature(212.0f);
		
		A.setScale('F');
		System.out.println(A.getDegreeC());
		System.out.println(A.getDegreeF());
		System.out.println();
		
		Temperature B = new Temperature('C');
		
		B.setDegree(100.0f);
		System.out.println(B.getDegreeC());
		System.out.println(B.getDegreeF());
		System.out.println();
		
		Temperature C = new Temperature(-40.0f, 'C');
		
		System.out.println(C.getDegreeC());
		System.out.println(C.getDegreeF());
		System.out.println();
		
		Temperature D = new Temperature();
		
		D.setDegreeScale(-40.0f, 'F');
		System.out.println(D.getDegreeC());
		System.out.println(D.getDegreeF());
		System.out.println();
		
		Temperature E = new Temperature(0.0f, 'C');
		
		Temperature F = new Temperature(32.0f);
		F.setScale('F');
		
		System.out.println("A equals B.");
		System.out.println(A.equals(B));
		System.out.println();
		System.out.println("C equals D.");
		System.out.println(C.equals(D));
		System.out.println();
		System.out.println("E equals F.");
		System.out.println(E.equals(F));
		System.out.println();
		
		Temperature G = new Temperature(76.0f, 'F');
		System.out.println(G.getDegreeC());
		System.out.println(G.getDegreeF());
		System.out.println();
		
		Temperature H = new Temperature(13.0f, 'C');
		System.out.println(H.getDegreeC());
		System.out.println(H.getDegreeF());
		System.out.println();
		
		System.out.println("G equals H.");
		System.out.println(G.equals(H));
		System.out.println("G is greater than H.");
		System.out.println(G.compareGreater(H));
		System.out.println("G is less than H.");
		System.out.println(G.compareLess(H));
		System.out.println();
		
		Temperature I = new Temperature(23.0f, 'C');
		System.out.println(I.getDegreeC());
		System.out.println(I.getDegreeF());
		System.out.println();
		
		Temperature J = new Temperature(120.0f, 'F');
		System.out.println(J.getDegreeC());
		System.out.println(J.getDegreeF());
		System.out.println();
		
		System.out.println("I equals J.");
		System.out.println(I.equals(J));
		System.out.println("I is greater than J.");
		System.out.println(I.compareGreater(J));
		System.out.println("I is less than J.");
		System.out.println(I.compareLess(J));

	}

}
