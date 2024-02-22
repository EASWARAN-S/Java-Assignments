// Program to perform bitwise AND  OR, XOR, left and right shift operations on them.

import java.util.Scanner;

public class BitwiseOperatorDemo {
    public static void main(String ar[]) {
        int number1 = getData();
        int number2 = getData();
        printData(number1, number2);
    }
//To get required input for the program 
     static int getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter a  value");
        return inputObj.nextInt();
    }

        
// To print the BitWise Operations   
    static void printData(int number1,int number2)
    {
        System.out.println("BitWise Operations for  " + number1 + " and " + number2);
        System.out.println("BitWise  AND Output is " + (number1 & number2));
        System.out.println("BitWise OR Output is " + (number1 | number2));
        System.out.println("BitWise XOR Output is " + (number1 ^ number2));
        System.out.println("BitWise left Shift Output is "  + (number1 << number2));
        System.out.println("BitWise Right Shift Output  is "  + (number1 >> number2));
        System.out.println("BitWise Right Shift Output  is "  + (number1 >>> number2));

    }

}
