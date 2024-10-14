// 45. Write a program to accept a file and replace one (or) more spaces with a single space.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library13 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

       
        try {
 
            String content = readFile(filePath);

        
            String modifiedContent = content.replaceAll("\\s+", " ");

         
            writeFile(filePath, modifiedContent);

            System.out.println("File has been processed. Multiple spaces replaced with single spaces.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }

        scanner.close();
    }

 
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

   
    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
    
}
