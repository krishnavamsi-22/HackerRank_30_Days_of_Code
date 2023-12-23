import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Declare and initialize variables
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read and save an integer, double, and String to your variables
        int intInput = scanner.nextInt();
        double doubleInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left by nextDouble
        String stringInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Perform the operations
        int sumInt = i + intInput;
        double sumDouble = d + doubleInput;
        String concatenatedString = s + stringInput;

        // Print the results
        System.out.println(sumInt);
        System.out.println(String.format("%.1f", sumDouble));
        System.out.println(concatenatedString);
    }
}
