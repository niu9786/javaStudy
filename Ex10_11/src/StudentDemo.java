import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] students = new Student[] {
		    new Student("KMS", 1034), new Student("LDJ", 1052), new Student("KBW", 1012),
		    new Student("MJS", 1084), new Student("PSH", 1035)
		};
		Arrays.sort(students);
		
		for (Student s : students) {
			s.writeOutput();
		}

	}

}
