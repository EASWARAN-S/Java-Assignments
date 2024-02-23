// Program to find the sum of even numbers only in a given array by Using  continue.

import java.util.*;

public class SumOfEvenNumbersInArray {

    public static void main(String[] args) {
        getData();
    }

    // To get input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter  the Length of the array");
        int arrayLen = inputObj.nextInt();
        System.out.println("Enter the numbers one by one");
        int[] arrayNumbers = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            arrayNumbers[i] = inputObj.nextInt();
        }
        sumOfEvenNumbers(arrayNumbers);
    }

    // TO calculate the sum of even numbers in the array
    static void sumOfEvenNumbers(int[] arrayNum) {
        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 != 0)
                continue;
            sum += arrayNum[i];
        }
        printSum(sum);
    }

    // To print the sum of even numbers in the given array
    static void printSum(int sum) {
        System.out.println("The Sum of even numbers in the given array is " + sum);

    }
}
