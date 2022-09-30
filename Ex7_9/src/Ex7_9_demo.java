
public class Ex7_9_demo {

	public static void main(String[] args) {
		Ex7_9 test1 = new Ex7_9();
		
		test1.setPassword("28475");
		
		System.out.println("PIN : 0 1 2 3 4 5 6 7 8 9");
		Ex7_9.numOutput();
		
		test1.inputNum();
		
		if (test1.matchPW() == true) {
			System.out.println("The password is correct.");
		}
		else {
			System.out.println("The password is incorrect.");
		}
		
	}

}
