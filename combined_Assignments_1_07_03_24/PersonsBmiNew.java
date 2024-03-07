// program to calculate a person's Body Mass Index on user input for weight and height.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonsBmiNew {
    static float weight;
    static float height;
    static float bmi;
    static String name;
    static String status;

    public static void assignData(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person " + number);
        name = sc.nextLine();
        height = (float) (getData("height", "Centimetres", number) / 100);
        weight = (float) getData("weight", "kilograms", number);
        bmi = (float) weight / (height * height);
        bmiStatus(bmi);

    }

    // To get required input for the program
    public static double getData(String valueName, String unit, int number) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println(
                "Enter the   value for " + valueName + " for calculating BMI in " + unit + " for  Person " + number);
        return inputObj.nextDouble();
    }

    // Standard Weight status
    public static void bmiStatus(double bmi) {
        if (bmi <= 18.5)
            status = "Under Weight";
        else if ((bmi > 18.5) && (bmi <= 24.9))
            status = "Healthy Weight";
        else if ((bmi > 25.0) && (bmi <= 29.9))
            status = "over weight";
        else
            status = "Obesity";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons to compare");
        int number = sc.nextInt();
        int count = 1;
        List<Persons> persons = new ArrayList<>();
        while (number-- > 0) {
            assignData(count);
            persons.add(new Persons(name, height, weight, bmi, status));
            count++;

            
           
        }
        Collections.sort(persons,Comparator.comparing(ls -> ls.bmi));
        Collections.reverse(persons);
       printDash();
       System.out.printf("%25s",     "BMI Report");
       System.out.println();
       printDash();

       System.out.printf("%-10s %10s %15s %10s %10s " ,"Name","Height in m","Weight in kg","BMI" , "Status");
       System.out.println(" ");

        for(int i = 0 ; i< persons.size();i++)
        {
            System.out.printf("%-10s %8.2f %15.2f %15.2f %15s " ,persons.get(i).name ,persons.get(i).height , persons.get(i).weight ,persons.get(i).bmi,persons.get(i).status);
            System.out.println(" ");
        }

    }

    public static void printDash()
    {
        for(int i = 0 ; i< 71 ; i++)
        System.out.print("-");
        System.out.println();
    }
}


class Persons {
    float weight;
    float height;
    float bmi;
    String name;
    String status;

    Persons(String name, float height, float weight, float bmi, String status) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.status = status;
    }
}