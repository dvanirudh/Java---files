// 48. Assume a txt file customers.txt which contains name & mobile no and 
// you need to display in sorted order of name.(Use regular expression)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library16 {
     public static void main(String[] args) {
    List<String> customers = new ArrayList<>();

    
        String regex = "^([A-Za-z ]+),\\s*(\\d{10})$";
        Pattern pattern = Pattern.compile(regex);


        String filePath = "customers.txt";

   
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
               
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    customers.add(line); 
                } else {
                    System.out.println("Invalid entry skipped: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

   
        Collections.sort(customers);

    
        System.out.println("Sorted customer list:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}