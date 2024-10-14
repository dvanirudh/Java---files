// 5. Write a program to accept five numbers from the user and display the average of numbers.

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number :");
        int base = sc.nextInt();
        int count = 1;
        int num;
        int sum = 0;
        while( count <= base){
            System.out.println("Enter the "+count+" number :");
            num = sc.nextInt();
            sum += num;
            ++count;
        }
        int average = sum / base;
        System.out.println(average);
        sc.close();
    }
}
