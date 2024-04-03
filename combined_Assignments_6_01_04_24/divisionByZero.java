import java.util.Scanner;

public class divisionByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Numerator");
            int a = sc.nextInt();
            System.out.println("Enter the Denominator");
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

    }
}
