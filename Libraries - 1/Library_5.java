// 22. Write a program to accept a string and display the position of space for all spaces.

import java.util.Scanner;

public class Library_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String --> ");
        String str = sc.nextLine();
        sc.close();
        stringSpaces(str);
    }

    public static void stringSpaces(String input){
       System.out.println("Positions of spaces in the string: ");
       for(int i = 0; i<input.length(); i++){
           if(input.charAt(i)== ' '){
            System.out.println("Space found at position " + i);
           }
       }
    }
}
