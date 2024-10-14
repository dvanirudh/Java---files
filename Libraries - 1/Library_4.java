// 21. Write a program to accept a string that contains marks separated by commas and display total.

import java.util.Scanner;

public class Library_4 {
    public static int Marks(String input){
        String[] marks = input.split(",");

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
          
            total += Integer.parseInt(marks[i].trim());
        }
        return total;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("Enter marks separated by commas: ");
        String input = sc.nextLine();

        int total = Marks(input);
        System.out.println("Total marks: " + total);

        sc.close();
 }
}
