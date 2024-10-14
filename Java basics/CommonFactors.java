//10. Write a program to create a function that takes multiple numbers and displays common factors.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();
        int[] numbers = new int[num];
        System.out.println("Enter the number : ");
        for (int i=0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        List<Integer> commonFactors = findCommonFactors(numbers);
        System.out.println("Common Factors: " + commonFactors);
        sc.close();
    }

    private static List<Integer> findCommonFactors(int[] numbers) {
        int min = Arrays.stream(numbers).min().orElse(1);
        List<Integer> commonFactors = new ArrayList<>();

        for (int i = 1; i <= min; i++) {
            boolean isCommonFactor = true;
            for (int num : numbers) {
                if (num % i != 0) {
                    isCommonFactor = false;
                    break;
                }
            }
            if (isCommonFactor) {
                commonFactors.add(i);
            }
        }

        return commonFactors;
    }
}

