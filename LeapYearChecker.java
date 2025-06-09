import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the year is a leap year
    public static  isLeapYear(int year) {
                if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check and display result using method
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
