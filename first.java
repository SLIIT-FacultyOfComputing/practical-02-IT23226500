import java.util.Scanner;

public class first{
  
  public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter your First name: ");
     String firstName = scanner.nextLine();
     
     System.out.print("Enter your Middle name: ");
     String middleName = scanner.nextLine();
     
     System.out.print("Enter your Last name: ");
     String lastName = scanner.nextLine();
     
     String fullName = new String (lastName + " " + firstName + " " + middleName);
     //String[] parts = fullName.split(" "); 
     
     //System.out.println(lastName + ", " + firstName + " " + middleName);
     System.out.println("Full name: "+ fullName);
     
     System.out.println("Enter another name");
     String fullName2 = scanner.nextLine();
     }
}
 // completed only part 1 of the basic question
     
    
     
