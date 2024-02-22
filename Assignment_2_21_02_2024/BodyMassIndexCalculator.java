// program to calculate a person's Body Mass Index on user input for weight and height.

import java.util.Scanner;

public class  BodyMassIndexCalculator {
       public static void main(String[] args)
    {
        double height = getData("height","metres");
        double weight = getData("weight","kilograms");
        double bmi =  weight / (height * height);
        printData(bmi);
    }
    
    //To get required input for the program 
    static double getData(String valueName,String unit ) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the   value for " + valueName + " for calculating BMI in " + unit );
        return inputObj.nextDouble();
    }

    // Standard Weight status 
    static void printData(double bmi)
    {
        System.out.println("The BMI for the given height and weight is " + bmi );
    }
}
