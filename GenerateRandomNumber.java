/* Program to Generate a random number  */
import java.Math.*;
import java.util.*;
public class GenerateRandomNumber {
    public static void main (String ar[])
    {Scanner inputObj = new Scanner(System.in);

        int min,max;
        System.out.println("Enter the minimum and maximum integer number to generate the random number");
        min = inputObj.nextInt();
        max = inputObj.nextInt();
        System.out.println((int)(Math.random()*(max-min+1)+min)   );
    }
}
