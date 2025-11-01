import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Part 1
        // Task 1
        int[] dataPoints = new int[100];

        // Task 2 - fill array with random numbers 1-100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // Task 3 - print all numbers separated by |
        System.out.println("Data Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else {
                System.out.print(dataPoints[i]);
            }
        }
        System.out.println(); // new line

        // Task 4 - sum and average
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Part 2
        // Task 5 - get number from user
        int userValue = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);

        // Task 6 - count how many times user value appears
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("Your number " + userValue + " was found " + count + " times in the array.");

        // Task 7 - find first occurrence of another user value
        int searchValue = SafeInput.getRangedInt(in, "Enter another number between 1 and 100 to search for", 1, 100);
        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + searchValue + " was found at index " + foundIndex + ".");
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }

        // Task 8 - find min and max
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The biggest number is: " + max);

        // Task 9 - call method to get average
        System.out.println("Average of dataPoints (using method): " + getAverage(dataPoints));
    }

    // Task 9 method
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double avg = (double) sum / values.length;
        return avg;
    }
}
