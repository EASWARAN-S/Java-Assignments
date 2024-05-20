import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String str = scanner.nextLine();
        System.out.println(infixToPostfix(str));
        scanner.close();
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isAlphabetic(exp.charAt(i)) || Character.isDigit(exp.charAt(i))) {
                str1.append(exp.charAt(i));
            } else {
                stack.push(exp.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            str1.append(stack.pop());
        }

        return str1.toString();
    }
}