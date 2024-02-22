// Program to solve the quadratic equation..

import java.util.Scanner;
import java.math.*;
public class QuadraticEquation {
    public static void main(String[] args)
    {
        int a,b,c ;
        System.out.println("Enter the  coefficients value for a,b,c");
        a = getData();
        b = getData();
        c = getData();
        double determinant = Math.pow(b,2) - 4*a*c;

        // determinant > 0 -- roots are real
        if(determinant > 0){
            System.out.println("Roots  " + (-b+Math.sqrt(determinant))/(2*a)
                                  + " and " + (-b-Math.sqrt(determinant))/(2*a) + " are real roots");
        }
        // determinant == 0 roots has only one real root
        else if (determinant == 0){
            System.out.println("Roots  " + -b/(2*a) + "is the only one real root");
        }

        //  determinant < 0 -- roots are imaginary and are complex
        else{
            System.out.println("Roots  " + -b/(2*a) + "+i" + 
                                Math.sqrt(-determinant)/(2*a) + " and "
                                + -b/(2*a) + "-i" + Math.sqrt(-determinant)/(2*a) + " are the  complex roots");
        }
       
    }
    //To get required input for the program from the user
    static int getData() {
        Scanner inputObj = new Scanner(System.in);
        return inputObj.nextInt();
    }
}
