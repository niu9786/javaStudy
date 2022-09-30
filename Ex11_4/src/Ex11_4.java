import java.util.Scanner;
import java.util.Arrays;

public class Ex11_4 {
   
   public static void main(String[] args) {
      String input, result, again;
      String[] months = {"January", "Febrary", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
      
      while (true) {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Write the numerical month-day:");
         input = keyboard.next();
         
         try {
            if (((input.length() == 4) && Integer.parseInt(input.substring(0, 1)) < 1)
                  || ((input.length() == 5) && ((Integer.parseInt(input.substring(0, 2)) < 1) || (Integer.parseInt(input.substring(0, 2)) > 12)))) {
               throw new MonthException();
            }
            else if (((input.length() == 4 && Integer.parseInt(input.substring(0, 1)) == 2)
                  || input.length() == 5 && Integer.parseInt(input.substring(0, 2)) == 2)) {
                  if (((input.length() == 4) && (Integer.parseInt(input.substring(2)) < 1 || Integer.parseInt(input.substring(2)) > 28))
                     || ((input.length() == 5) && (Integer.parseInt(input.substring(3)) < 1 || Integer.parseInt(input.substring(3)) > 28))) {
                     throw new DayException();
                  }
            }
            else if ((((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 1)
                  || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 1)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 3)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 3)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 5)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 5)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 7)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 7)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 8)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 8)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 10)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 10)))
                  || (((input.length() == 4) && (Integer.parseInt(input.substring(0, 1)) == 12)
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 12)))) {
                  if (((input.length() == 4) && (Integer.parseInt(input.substring(2)) < 1 || Integer.parseInt(input.substring(2)) > 31))
                        || ((input.length() == 5) && (Integer.parseInt(input.substring(3)) < 1 || Integer.parseInt(input.substring(3)) > 31))) {
                     throw new DayException();
                  }
            }
            else if ((((input.length() == 4) && ((Integer.parseInt(input.substring(0, 1)) == 4))
                  || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 4)))
                  || (((input.length() == 4) && ((Integer.parseInt(input.substring(0, 1)) == 6))
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 6)))
                  || (((input.length() == 4) && ((Integer.parseInt(input.substring(0, 1)) == 9))
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 9)))
                  || (((input.length() == 4) && ((Integer.parseInt(input.substring(0, 1)) == 11))
                        || (input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) == 11)))) {
                  if (((input.length() == 4) && (Integer.parseInt(input.substring(2)) < 1 || Integer.parseInt(input.substring(2)) > 30))
                  || ((input.length() == 5) && (Integer.parseInt(input.substring(3)) < 1 || Integer.parseInt(input.substring(3)) > 30))) {
                     throw new DayException();
                  }
            }
            if (input.length() == 4) {
               int month = Integer.parseInt(input.substring(0, 1));
               result = months[month - 1] + " " + input.substring(2);
            }
            else {
               int month = Integer.parseInt(input.substring(0, 2));
               result = months[month - 1] + " " + input.substring(3);
            }
            System.out.println(result);
         } catch (DayException e) {
            System.out.println("Error: Invalid Day");
            System.out.println("Try Again");
         } catch (MonthException e) {
            System.out.println("Error: Invalid Month");
            System.out.println("Try Again");
         } 
         System.out.println("Again? (y/n)");
         again = keyboard.next();
         if (again.equals("n")) {
            System.out.println("End of program");
            break;
         }
      }
   }
}