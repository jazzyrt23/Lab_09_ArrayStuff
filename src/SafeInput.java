import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        int value = 0;
        boolean done = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (in.hasNextInt()) {
                value = in.nextInt();
                if (value >= low && value <= high) {
                    done = true;
                } else {
                    System.out.println("Error: number must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Error: please enter an integer.");
                in.next(); // clear bad input
            }
        } while (!done);

        return value;
    }
}
