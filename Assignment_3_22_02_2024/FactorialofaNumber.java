// Program to find a factorial of a number 

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] arg) {
        getData();
    }

    // To get the input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the  a number to find a factorial ");
        int number1 = inputObj.nextInt();
        factorialOfANumber(number1);
    }

    // To find a factorial of a Number
    static void factorialOfANumber(int number1) {
        int factorial = 1;
        for (int i = 1; i <= number1; i++)
            factorial *= i;
        printFactorial(number1, factorial);
    }

    // To print the factorial result
    static void printFactorial(int number1, int factorial) {
        System.out.println("The factorial of " + number1 + " is " + factorial);
    }
}
