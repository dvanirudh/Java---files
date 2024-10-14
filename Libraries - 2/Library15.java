// 47. Write a program to display the file which contains the given string in a path.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Library15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();


        System.out.print("Enter the string to search for: ");
        String searchString = sc.nextLine();

    
        File directory = new File(directoryPath);


        if (!directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }


        File[] files = directory.listFiles();

        if (files != null) {
         
            for (File file : files) {
                if (file.isFile()) {
                  
                    if (containsString(file, searchString)) {
                        System.out.println("The string \"" + searchString + "\" is found in: " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }

        sc.close();
    }

  
    private static boolean containsString(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
        return false;
    }
}
