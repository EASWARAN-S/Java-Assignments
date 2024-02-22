// Program to convert Celsius  to Fahrenheit  
import java.util.*;

public class ConvertCelsiusFahrenheit {
    public static void main(String[] args) {
        double celsiusValue = getData();
        double fahrenheitValue = (celsiusValue * 9 / 5) + 32;
        printData(fahrenheitValue);
    }

//To get required input for the program 
    static double getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the   value");
        return inputObj.nextDouble();
    }
    
// To print the temperature in fahrenheit  
    static void printData(double temperature) {
        String degreeSymbol = "\u00B0";
        System.out.println("The temperature in celsius value is " + temperature + degreeSymbol + " F");

    }
}
