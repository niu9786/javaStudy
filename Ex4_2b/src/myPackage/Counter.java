package myPackage;

public class Counter { // Methods
	private int count;
	
	public int setCount() {
		count = 0;
		return count;
	}
	
	public void incCount() {
		count += 1;
	}
	
	public void decCount() {
		if (count > 0) {
			count -= 1;
		}
	}
	
	public void getCurCount() {
		System.out.println("Current count value is " + count);
	}
	
	public static void main(String[] args) { // test program
		
		Counter counterObj = new Counter();
		
		counterObj.setCount();
		counterObj.getCurCount();
		
		counterObj.incCount();
		counterObj.getCurCount();
		
		counterObj.incCount();
		counterObj.getCurCount();
		
		counterObj.decCount();
		counterObj.getCurCount();
		
		counterObj.decCount();
		counterObj.getCurCount();
		
		counterObj.decCount();
		counterObj.getCurCount();

	}

}

