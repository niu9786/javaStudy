
public class Person {
	private String name;
	private int age;
	private static Person adult = new Person("An adult", 21);
	private static Person toddler = new Person("A toddler", 2);
	private static Person preschooler = new Person("A preschooler", 5);
	private static Person adolescent = new Person("An adolescent", 9);
	private static Person teenager = new Person("A teenager", 15);
	
	public Person() {
		this.name = "No name yet";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static Person createAdult() {
		return adult;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String first, String last) {
		this.name = first + last;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Person createToddler() {
		return toddler;
	}
	
	public static Person createPreschooler() {
		return preschooler;
	}
	
	public static Person createAdolescent() {
		return adolescent;
	}
	
	public static Person createTeenager() {
		return teenager;
	}
}
