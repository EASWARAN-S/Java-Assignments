/* program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions.
 Use proper datatypes for the variables. */

import java.util.Scanner;

public class AverageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] weights = new float[10];
        float sum = 0f;

        System.out.println("Enter the 10 people's weight in kilograms one by one");
       
        //getting input from the user....
        for (int i = 0; i < 10; i++) {
            weights[i] = (float) sc.nextDouble();
        }
       
        /* Calculating the average weight of the 10 persons ... */
        for (int i = 0; i < 10; i++) {

            sum += weights[i];
        }

        float average = sum / 10 ;



        System.out.println("Average Weight of the 10 people is " + average + " Kg");
    }
}
