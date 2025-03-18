import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // 1 dan 100 gacha tasodifiy son
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%d | ", dataPoints[i]);
        }

        int sum = 0;
        double average;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value between 1 and 100: ");
        int val = in.nextInt();
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == val) {
                count++;
            }
        }
        System.out.println("The number of times your value is found within the array is: " + count);

        System.out.print("Enter another value between 1 and 100: ");
        int val2 = in.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == val2) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Your value was not found in the array");
        } else {
            System.out.println("Your value was found at index " + foundIndex);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }

        System.out.println("The min value in the array is: " + min);
        System.out.println("The max value in the array is: " + max);

        in.close();
    }
}
