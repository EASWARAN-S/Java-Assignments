//  Program  to return index in which the given number occurs for the second time in an array,

import java.util.Scanner;

public class FindIndexofSecondOccurence {

    public static void main(String[] args) {
        getData();
    }

    // To get input from the user
    static void getData() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter  the Length of the array");
        int arrayLen = inputObj.nextInt();
        System.out.println("Enter the numbers one by one");
        int[] arrayNumbers = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            arrayNumbers[i] = inputObj.nextInt();
        }
        System.out.println("Enter the number to which the index to be find");
        int num = inputObj.nextInt();
        findIndexofSecondOccurence(arrayNumbers, num);
    }

    // TO find the index of the second occurence of the given number 
    static void findIndexofSecondOccurence(int[] arrayNum, int num) {
        int count = 0, index = -1;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == num) {
                count++;
                if (count == 2) {
                    index = i;
                    break;
                }

            }
        }
        printResult(num, index);
    }

    // To print the index of the second occurence of the given number 
    static void printResult(int num, int res) {
        System.out.println("The index of the second occurrence of the number  " + num + " is " + res);

    }

}
