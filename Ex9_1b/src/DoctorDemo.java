
public class DoctorDemo {

	public static void main(String[] args) {
		Specialty aDoctorSpecialty = Specialty.Medicine;
		Specialty bDoctorSpecialty = Specialty.Oriental;
		Specialty cDoctorSpecialty = Specialty.Medicine;
		
		Doctor aDoctor = new Doctor();
		aDoctor.setName("Kim Min-Su");
		aDoctor.setSpecialty(aDoctorSpecialty.Medicine);
		aDoctor.setVisit_fee(30);
		
		aDoctor.toString();
		System.out.println("The specialty of A doctor: " + aDoctor.getSpecialty());
		
		Doctor bDoctor = new Doctor("Lee Hyun Su", bDoctorSpecialty.Oriental, 40);
		
		bDoctor.toString();
		System.out.println("The name of B doctor: " + bDoctor.getName());
		System.out.println("The visit fee of B doctor: " + bDoctor.getVisit_fee());
		
		Doctor cDoctor = new Doctor("Kim Min-Su", cDoctorSpecialty.Medicine, 30);
		
		System.out.println("The specialty of C doctor: " + cDoctor.getSpecialty());
		
		System.out.println(aDoctor.equals(bDoctor));
		System.out.println(aDoctor.hasSameName(bDoctor));
		System.out.println(aDoctor.equals(cDoctor));
		System.out.println(aDoctor.hasSameName(cDoctor));

	}

}
