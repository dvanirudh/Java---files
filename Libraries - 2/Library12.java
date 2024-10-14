// 44. Write a program to accept a string & display each word on a separate line (use any separator)

import java.util.Scanner;

public class Library12 {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String separator = " ";

      
        String[] words = input.split(separator);

        
        System.out.println("Words in the input string:");
        for (String word : words) {
            System.out.println(word);
        }

      
        scanner.close();
    }
    
}
