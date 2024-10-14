
//6. Write a program to accept the number and display the largest factor other than the number.


import java.util.Scanner;
public class FactorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int result = factor(10);
        System.out.println(result != -1
                ? "The largest factor of " + n + " other than the number itself is: " + result
                : "The number " + n + " has no factors other than itself.");
        sc.close();        
    }

    public static int factor(int n) {
        for (int i = n / 2; i >= n; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return -1;
    }
}