
//9. Write a program to create a function that takes a set of integers and returns the largest of integers.

import java.util.Arrays;
import java.util.Scanner;

public class LargeInt {
    public void largestE(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] + " is the largest number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        LargeInt obj = new LargeInt();
        obj.largestE(arr);
        sc.close();
    }
}

