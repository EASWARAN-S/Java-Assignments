
import java.util.Scanner;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 51, 25, 86, 99, 14, 56, 33, 445, 669, 7775, 552, 746 };

        try {
            System.out.println("Enter the index ot print the element of an array : \n");
            int index = sc.nextInt();
            System.out.println("Element is : " + number[index]);

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Index is out of range .....\n");
            System.out.println(ae.getMessage());
        }

    }

}