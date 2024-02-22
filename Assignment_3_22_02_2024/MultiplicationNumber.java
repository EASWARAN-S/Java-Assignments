// To Program to print multiplication table of a given number in a neat format

import java.util.Scanner;

public class MultiplicationNumber {
        public static void main(String[] arg) {
        getData();
    }

    // To get the input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter  a number to print the multiplication table ");
        int number1 = inputObj.nextInt();
        printMultiplicationTable(number1);
    }

    // To print multiplication table for the given number 
    static void printMultiplicationTable(int number1) {
        System.out.println("Multiplication Table for " + number1);
        for (int i = 1; i <= 10; i++)
        System.out.println( i  + "  x " + number1 +  " = " + (i * number1));
       
    }


}
