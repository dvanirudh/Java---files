// 18. Write a program to guess the random number in three attempts. The range is (1 to 25).

import java.util.Random;
import java.util.Scanner;

public class Library_1{
    
    public static void Range(int num){
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      int attempts = 3;
      int randomNumber = random.nextInt(25) + 1;
      for(int i = 1; i <= attempts ;i++){
           if(num == randomNumber){
            System.out.println(" you have given the right number. "+randomNumber); 
            break;
           }
           else if (i == attempts) {
            System.out.println("Sorry! You've used all your attempts. The correct number was: " + randomNumber);
        }
        else{
            System.out.println("Invalid guess, try again.");
            System.out.print("Attempt " + (i + 1) + ": Please enter a number between 1 and 25: ");
            num = scanner.nextInt();
           }
           }
         scanner.close();
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess number from 1 to 25 : ");
        int input = sc.nextInt();
        Range(input);
        sc.close();
    }
}