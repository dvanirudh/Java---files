
// 43. Write a program to accept pan no and check whether it is valid or not.




import java.util.Scanner;
import java.util.regex.Pattern;

public class Library11 {
      public static boolean isValidPAN(String pan) {
        // Regular expression for PAN number validation
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        
        // Check if the PAN matches the regex pattern
        return Pattern.matches(regex, pan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept PAN number input from user
        System.out.print("Enter your PAN number: ");
        String pan = scanner.nextLine().trim();

        // Validate the PAN number
        if (isValidPAN(pan)) {
            System.out.println("PAN number is valid.");
        } else {
            System.out.println("PAN number is invalid.");
        }

        scanner.close();
    }
    
}
