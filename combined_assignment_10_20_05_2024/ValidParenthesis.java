import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");

        String str = sc.nextLine();
        if (isParenthesesBalanced(str)) {
            System.out.println(str + " is Balanced");
        } else {
            System.out.println(str + " is not Balanced");
        }

    }

    public static boolean isParenthesesBalanced(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{') {
                if (text.charAt(i) == '(') {
                    stack.push(')');
                } else if (text.charAt(i) == '[') {
                    stack.push(']');
                } else {
                    stack.push('}');
                }
            } else if (text.charAt(i) == ')' || text.charAt(i) == ']' || text.charAt(i) == '}') {
                if (!stack.isEmpty() && text.charAt(i) != stack.pop()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
