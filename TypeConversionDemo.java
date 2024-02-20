/* Program to demonstrate  compatible type conversions. For eg., float to int, double to float, int to short */
import java.util.*;
public class TypeConversionDemo {
    public static void main(String ar[])
    {
        Scanner inputObj = new Scanner(System.in);

        // Implicit type Conversion .. 
        int num1 = 100;
        float num2 = num1;
        long num3 = num1;          
        
        System.out.println("int value" + num1);
        System.out.println("float value" + num2);
        System.out.println("long value" + num3);

        // Explicit Type Conversion....
        System.out.println("Enter the decimal value");
        double num4 = inputObj.nextDouble();
        System.out.println("long value" + (long)num4);
        

    }
}
