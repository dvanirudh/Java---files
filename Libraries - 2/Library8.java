// 40. Write a program to assume names1.txt & names2.txt 
// where we have one name for line & display unique names from both the files in the order they appear.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library8 {
    public static void main(String[] args) {
        
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        String file1 = "names1.txt";
        String file2 = "names2.txt";

        readNamesFromFile(file1, uniqueNames);

        readNamesFromFile(file2, uniqueNames);

        System.out.println("Unique names from both files:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }

      private static void readNamesFromFile(String fileName, LinkedHashSet<String> uniqueNames) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();
                if (!name.isEmpty()) {
                    uniqueNames.add(name); 
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }   
}
