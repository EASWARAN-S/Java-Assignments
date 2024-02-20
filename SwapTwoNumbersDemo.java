
/* Program to swap the two given numbers.​ */
import java.util.*;

public class SwapTwoNumbersDemo {
    public static void main(String ar[]) {
        int number1 = getData();
        int number2 = getData();
        System.out.println("Before Swapping");
        printData(number1, number2);
        System.out.println("After Swapping");
        swapValues(number1, number2);
    }

    static int getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter a integer value");
        return inputObj.nextInt();
    }

    static void swapValues(int num1, int num2) {
        printData(num2, num1);
    }

    static void printData(int num1,int num2)
    {
        System.out.println("The Numbers are " + num1 + " and " + num2);
    }
}
