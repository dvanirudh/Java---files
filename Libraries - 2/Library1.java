import java.util.Scanner;

// 32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.
//  all classes and handle exceptions.

public class Library1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int result = NumSum();
       System.out.println("The sum of positive numbers are " +result);
    }

    public static int NumSum(){
        System.out.println("Enter numbers (enter 'O' to stop):");
        int sum  = 0;
        while(true){
        System.out.println("Enter a number:");
        String n = sc.next();
        if(n.equalsIgnoreCase("o"))
            break;
        
        try{
        int input = Integer.parseInt(n);
        if (input > 0) {
            sum += input;
        }
      
    }
    catch (NumberFormatException e) {
        System.out.println("Invalid input, please enter a valid number or 'O' to stop.");
    }
        }
        return sum;
    
}
}