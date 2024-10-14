
// 20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.

import java.util.Scanner;


public class Library_3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Enter input of the string :");
        StringInput(st);
        sc.close();
    }
    public static void StringInput(String st1){
           System.out.println("Given Input String is : "+st1);
    } 
}
