// 34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Library3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the filename from the user
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int ch;
      
            
            while ((ch = br.read()) != -1) {
                char character = (char) ch;

                if (Character.isUpperCase(character)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(character)) {
                    lowercaseCount++;
                } else if (Character.isDigit(character)) {
                    digitCount++;
                }
            }

            System.out.println("Uppercase letters: " + uppercaseCount);
            System.out.println("Lowercase letters: " + lowercaseCount);
            System.out.println("Digits: " + digitCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        
        scanner.close();
    }

}