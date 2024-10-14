
// 23. Write a program to take a String and invert the case of characters.


import java.util.Scanner;

public class Library_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter a string--> ");
         String input = scanner.nextLine();
       
         StringBuilder result = invertedCase(input);
        
         // Print the original and modified strings
         System.out.println("Given String is --> " + input);
         System.out.println("Inverted case string is --> " + result.toString());

         scanner.close();
    }
         public static StringBuilder invertedCase(String s){ 
            StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) 
                 str.append(Character.toLowerCase(ch));     
            else if(Character.isLowerCase(ch))
                str.append(Character.toUpperCase(ch));  
            else
                str.append(ch);
        }
        return str;
       
    } 
    
}
