//  Program to find the number of days in a given month and year.

import java.util.Scanner;

public class FindDaysInMonthYear {
    public static void main(String[] arg) {
        getData();
    }

    // To get the input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter  the month name fully");
        String month = inputObj.nextLine();
        System.out.println("Enter  the Year");
        int year = inputObj.nextInt();
        printDays(month, year);
    }

    // To print the days in the given month and year
    static void printDays(String month, int year) {
        month = month.toUpperCase();
        switch (month) {
            case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER":
                System.out.println(" Number of Days in " + month + " , " + year + " is 31");
                break;
            case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER":
                System.out.println(" Number of Days in " + month + " , " + year + " is 30");
                break;
            case "FEBRUARY":
                System.out.println(" Number of Days in " + month + " , " + year + " is " + calculateLeapYear(year));
                break;
            default:
                System.out.println(" Enter the name of the month correctly");
                break;
        }

    }
// To calculate the leap year days 
    static int calculateLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100!= 0) || (year%400 == 0)) ?  29  : 28;
    }
}
