// 29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.
// 30. Go back to all classes and handle exceptions.

import java.util.Scanner;

public class FaultToleranr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = new String[5];
        System.out.println("Please enter 5 numbers (as strings):");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextLine();
        }
        int totalSum = calculateTotal(numbers);
        System.out.println("The total sum of valid numbers is: " + totalSum);
        sc.close();
    }

    public static int calculateTotal(String[] values) {
    int sum =0;
    for(String number: values){
         try{
            int value = Integer.parseInt(number);
            sum += value;
         }
         catch(NumberFormatException e){
            System.out.println("Invalid number format: '" + number + "'. Skipping this value.");
         }
    }
    return sum;
}
    
}
