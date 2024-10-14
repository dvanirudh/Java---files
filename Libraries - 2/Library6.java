// 38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)


import java.io.*;
import java.nio.file.*;


public class Library6 {
    public static void convertFileToUppercase(String filename) throws IOException {
        Path path = Paths.get(filename);
        

        String content = new String(Files.readAllBytes(path));
        
       
        Files.write(path, content.toUpperCase().getBytes());
    }

    public static void main(String[] args) throws IOException {
     
        String filename = "input.txt";  

        convertFileToUppercase(filename);
        System.out.println("File contents converted to uppercase.");
    }
}
