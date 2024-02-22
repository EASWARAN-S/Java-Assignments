// Program to find the greatest of three numbers

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    
    public  static void main (String[] arg)
    {
getData();
    }

    // To get the input from the users 
    static void getData()
    {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the  three numbers of type integers one by one" );
        int  number1 = inputObj.nextInt();
        int number2  = inputObj.nextInt();
        int number3 = inputObj.nextInt();
        findGreatestAndPrint(number1,number2,number3);
    }

    // To find the greatest number and print the result 

    static void findGreatestAndPrint(int number1,int number2,int number3)
    {
int greatestNumber = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : number2;
System.out.println("The greatest number: " + greatestNumber);
    }
}
