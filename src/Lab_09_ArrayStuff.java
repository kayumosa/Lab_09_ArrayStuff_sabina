import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1: Declare an array named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // Task 2: Fill the array with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display array values in a formatted way
        System.out.print("Array values: ");
        for (int val : dataPoints) {
            System.out.print(val + " | ");
        }
        System.out.println();

        // Task 4: Calculate and display sum and average of the array
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = sum / (double) dataPoints.length;
        System.out.println("Sum of array values: " + sum);
        System.out.println("Average of array values: " + average);

        // Task 5: Prompt user for an integer between 1 and 100
        System.out.print("Enter a number between 1 and 100: ");
        int userValue = scanner.nextInt();

        // Task 6: Count occurrences of user input in the array
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) count++;
        }
        System.out.println("The number " + userValue + " appears " + count + " times in the array.");

        // Task 7: Find the first occurrence of user input in the array
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The number " + userValue + " is found at index " + position + ".");
        } else {
            System.out.println("The number " + userValue + " is not found in the array.");
        }

        // Task 8: Find the minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        // Task 9: Compute the average using a static method
        System.out.println("Average calculated using method: " + getAverage(dataPoints));
    }

    // Static method to compute the average of an array
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum / (double) values.length;
    }
}

