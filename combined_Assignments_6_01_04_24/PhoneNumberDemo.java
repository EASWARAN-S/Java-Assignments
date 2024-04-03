
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Phone Number: ");
            long phoneNum = sc.nextLong();
            System.out.println("Phone Number: " + phoneNum);
        } catch (InputMismatchException ime) {

            System.out.println("Input Mismatch Exception");

        }

    }

}