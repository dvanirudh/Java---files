//7. Write a program to accept the number and display the number in reverse order.


import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
           reverse(num);
        sc.close();   
    }
    public static void reverse(int num){
        int re = 0;
        while (num != 0 ){
         int remainder =  num % 10;
         re = re * 10 + remainder;
          num = num / 10;
        }
        System.out.println(re);
    }
}
