import java.util.Random;

// 19. Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.

public class Library_2 {
    public static void main(String[] args) {
          int[] array = new int[10];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.println("Array elements:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nAverage of the array: " + average);

        System.out.println("Elements greater than the average:");
        for (int value : array) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
    }
}
