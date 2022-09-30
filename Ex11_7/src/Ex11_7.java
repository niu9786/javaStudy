import java.util.Arrays;
import java.util.Scanner;

public class Ex11_7 {
   
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Employee[] employeeArr = new Employee[100];
      int count = 0;
      
      while (true) {
         try {
            System.out.println("Write name of the employee:");
            System.out.println("(If you want to end program, write 'End')");
            String newName = keyboard.next();
            if (newName.equalsIgnoreCase("End")) {
               System.out.println("End of program");
               break;
            }
            
            System.out.println("Write social security number of the employee:");
            String newSocialSecurityNumber = keyboard.next();
            String rawSocialSecurityNumber = newSocialSecurityNumber.replace(" ", "");
            
            if (rawSocialSecurityNumber.length() != 9) {
               throw new SSNLengthException();
            }
            for (int i = 0; i < 9; i++) {
               char tmp = newSocialSecurityNumber.charAt(i);
               
               if (Character.isDigit(tmp) == false)
                  throw new SSNCharacterException();
            }

            System.out.println("Write salary of the employee:");
            String newSalary = keyboard.next();
            
            employeeArr[count] = new Employee(newName, newSocialSecurityNumber, newSalary);
            
            for (int i = 0; i < (count + 1); i++) {
               System.out.println("Number: " + (i + 1));
               employeeArr[i].writeOutput();
               System.out.println();
            }
            count ++;
         } catch (SSNLengthException e) {
            System.out.println("Social security number should be nine characters!");
         } catch (SSNCharacterException e) {
            System.out.println("One of the social security number which you wrote is not a digit");
         }
      }
   }
}