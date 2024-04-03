import java.util.Scanner;

class CustomException extends Exception {
    CustomException() {
        super("Age is under 18");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int n = sc.nextInt();
        try {
            if (n >= 18) {
                System.out.println("You are eligible to vote");
            } else {
                throw new CustomException();

            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}