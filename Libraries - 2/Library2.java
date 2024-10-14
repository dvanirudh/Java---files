// 33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (FileWriter writer = new FileWriter("names.txt")) {
            String name;
            
            System.out.println("Enter names (type 'END' to stop):");
            while (true) {
                name = scanner.nextLine();
                
                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                
                writer.write(name + System.lineSeparator());  // Write name to the file
            }
            
            System.out.println("Names have been written to names.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
