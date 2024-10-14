// 35. Write a program to display lines that contains more than 5 characters.


import java.util.Scanner;

public class Library4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of text (type 'exit' to quit): ");
        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            if(input.length()>5){
                System.out.println("Line with more than 5 characters: " + input);
            }
        }
        sc.close();
    }
    
}
