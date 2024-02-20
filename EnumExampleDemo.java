/* Program to get a number and display the week day using ENUM */

import java.util.Scanner;
 enum weekDay{
    SUNDAY,
    MONDAY ,
    TUESDAY,
    WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY
}
public class EnumExampleDemo {
  
    public static void main(String ar[])
    {
    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter a number from 0 to 6");
    int userChoice = inputObj.nextInt();
    if((userChoice <= 6 ) || (userChoice > 0))
    {
        weekDay day = weekDay.values()[userChoice];
        System.out.println(day);
    }
    else{
        System.out.println("Invalid number");
    }
  

   
    }   
    
}
