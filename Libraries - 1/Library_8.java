//  26. Write a program to accept starting_date and ending_date in DD-MM-YYYY format 
// and display no of days between those two dates.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Library_8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Accept starting date
        System.out.print("Enter the starting date (DD-MM-YYYY): ");
        String startDateInput = scanner.nextLine();

        // Accept ending date
        System.out.print("Enter the ending date (DD-MM-YYYY): ");
        String endDateInput = scanner.nextLine();

        try {
            // Parse dates
            Date startDate = dateFormat.parse(startDateInput);
            Date endDate = dateFormat.parse(endDateInput);

            // Calculate difference in milliseconds
            long differenceInMillis = endDate.getTime() - startDate.getTime();

            // Convert milliseconds to days
            long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);

            // Display the result
            System.out.println("Number of days between " + startDateInput + " and " + endDateInput + " is: " + differenceInDays);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MM-YYYY.");
        } finally {
            scanner.close();
        }
    }

}
   



 