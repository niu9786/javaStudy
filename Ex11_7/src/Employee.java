
public class Employee extends Person {
   private String socialSecurityNumber, salary;
   
   public Employee(String name, String socialSecurityNumber, String salary) {
      super(name);
      this.socialSecurityNumber = socialSecurityNumber;
      this.salary = salary;
   }

   public String getSocialSecurityNumber() {
      return socialSecurityNumber;
   }
   
   public void setSocialSecurityNumber(String socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
   }

   public String getSalary() {
      return salary;
   }
   
   public void setSalary(String salary) {
      this.salary = salary;
   }
   
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Social Security Number: " + this.socialSecurityNumber);
      System.out.println("Salary: " + this.salary);
   }

}