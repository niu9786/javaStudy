
public class PersonDemo {

	public static void main(String[] args) {
		Person minsu = new Person();
		System.out.println(minsu.getName());
		System.out.println(minsu.getAge());
		System.out.println();
		
		minsu.setName("Kim", "Minsu");
		minsu.setAge(21);
		
		System.out.println(minsu.getName());
		System.out.println(minsu.getAge());
		System.out.println();
		
		Person jungsu = new Person();
		System.out.println(jungsu.getName());
		System.out.println(jungsu.getAge());
		System.out.println();
		
		jungsu.setName("SonJungsu");
		jungsu.setAge(18);
		System.out.println(jungsu.getName());
		System.out.println(jungsu.getAge());
		System.out.println();
		
		Person youngsu = new Person("youngsu", 22);
		
		System.out.println(youngsu.getName());
		System.out.println(youngsu.getAge());
		System.out.println();
		
		Person hansu = Person.createAdult();
		System.out.println(hansu.getName());
		System.out.println(hansu.getAge());
		System.out.println();
		
		Person hyunsu = Person.createToddler();
		System.out.println(hyunsu.getName());
		System.out.println(hyunsu.getAge());
		System.out.println();
		
		Person jinsu = Person.createPreschooler();
		System.out.println(jinsu.getName());
		System.out.println(jinsu.getAge());
		System.out.println();
		
		Person sungsu = Person.createAdolescent();
		System.out.println(sungsu.getName());
		System.out.println(sungsu.getAge());
		System.out.println();
		
		Person dongsu = Person.createTeenager();
		System.out.println(dongsu.getName());
		System.out.println(dongsu.getAge());
		System.out.println();
	}

}
