import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the year.
        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year or not
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
