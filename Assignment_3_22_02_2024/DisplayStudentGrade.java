// Program that takes a student's score as input and outputs their corresponding grade.

import java.util.Scanner;

public class DisplayStudentGrade {
    
        public static void main(String[] arg) {
        getData();
    }

    // To get the input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter  the Score of the Student to see the Grade ");
        double score = inputObj.nextDouble();
        printGrade(score);
    }

    // To print the Student Grade based on the Score
    static void printGrade(double number1) {
        if(number1 < 35)
        System.out.println("Grade of the Student is F");
        else if((number1 >= 35) && (number1 <= 50))
        System.out.println("Grade of the Student is E");
        else if((number1 >= 51) && (number1 <= 60))
        System.out.println("Grade of the Student is D");
        else if((number1 >= 61) && (number1 <= 70))
        System.out.println("Grade of the Student is C");
        else if((number1 >= 71) && (number1 <= 80))
        System.out.println("Grade of the Student is B");
        else if((number1 >= 81) && (number1 <= 90))
        System.out.println("Grade of the Student is A");
        else if((number1 >= 91) && (number1 <= 95))
        System.out.println("Grade of the Student is A+");
        else if((number1 >= 96) && (number1 <= 100))
        System.out.println("Grade of the Student is O");
        else
        System.out.println("Not a valid score");


       
    }


}
