// program to to convert time entered in seconds to HH:mm:ss format.

import java.util.Scanner;

public class ConvertSecondsToTime {
    public static void main(String[] args) {
        int seconds = getData();
        int hours = seconds / 3600;
        int minutes = ((seconds % 3600) / 60);
        int secondsTime = ((seconds % 3600) % 60);
        printData(hours, minutes, secondsTime);

    }

    // To get required input for the program
    static int getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the seconds");
        return inputObj.nextInt();
    }

    // To print the given seconds in time formatF
    static void printData(int hours, int minutes, int seconds) {
        System.out.println("The Time is " + hours + ":" + minutes + ":" + seconds);
    }

}
