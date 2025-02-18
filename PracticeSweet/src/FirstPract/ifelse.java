

package FirstPract;

import java.util.Scanner;

public class ifelse{
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Scale Number 1 - 10");
        int number = scanner.nextInt();

        if (number <= 4) {
            System.out.println("Good");
        } else if (number == 5) {
            System.out.println("Neutral");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Very Good");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        }
    }
}
