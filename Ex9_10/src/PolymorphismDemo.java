
public class PolymorphismDemo {

	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		for (Person p : people) {
			p.writeOutput();
			System.out.println();
		}
		
		Person[] employee = new Person[4];
		employee[0] = new Employee("Kim, SangDuck", 0506, "Develop");
		employee[1] = new Staff("Mu, YaHo", 4124, "Security", 8);
		employee[2] = new Faculty("Oh, CheonWon", 2131, "Accounting", "Employee of accounting department");
		employee[3] = new Staff("Jung, HyungDon", 3864, "Entertainment", 20);
		for (Person p : employee) {
			p.writeOutput();
			System.out.println();
		}

	}

}
