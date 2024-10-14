// 39. Write a program to take names from names.txt & display unique names in sorted order.


import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Library7 {
    public static Set<String> getUniqueSortedNames(String filename) throws IOException {
        Path path = Paths.get(filename);
        
  
        List<String> lines = Files.readAllLines(path);

       
        Set<String> uniqueNames = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        uniqueNames.addAll(lines);

        return uniqueNames;
    }

    // Method to display unique sorted names
    public static void displayNames(Set<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = "names.txt"; 
        
        Set<String> uniqueNames = getUniqueSortedNames(filename);  
        System.out.println("Unique names in sorted order:");
        displayNames(uniqueNames); 
    }
    
}
