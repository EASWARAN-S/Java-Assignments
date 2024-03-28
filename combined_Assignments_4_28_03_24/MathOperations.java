public class MathOperations {
    public static void main(String args[]) {

        new MathOperations().add(10, 20);
        new MathOperations().add(10.25, 20.85);
        new MathOperations().add("Hello", "World");
        new MathOperations().add('H', 'A');
        new MathOperations().sub(70, 20);
        new MathOperations().sub(80.25, 20.85);
        new MathOperations().multiply(10, 20);
        new MathOperations().multiply(10.25, 20.85);
        new MathOperations().divide(120, 4);
        new MathOperations().divide(120.24, 4.00);

    }

    public void add(int num1, int num2) {
        System.out.println("Addition of Integers is  " + (num1 + num2));
    }

    public void add(double num1, double num2) {
        System.out.println("Addition of double is  " + (num1 + num2));
    }

    public void add(char num1, char num2) {
        System.out.println("Addition of two characters is " + (num1 + num2));
    }

    public void add(String num1, String num2) {
        System.out.println("Addition of two Strings is " + (num1 + num2));
    }

    public void sub(int num1, int num2) {
        System.out.println("Subtraction of Integers is " + (num1 - num2));
    }

    public void sub(double num1, double num2) {
        System.out.println("Subtraction of double values is " + (num1 - num2));
    }

    public void multiply(int num1, int num2) {
        System.out.println("Multiplication of Integers is " + (num1 * num2));
    }

    public void multiply(double num1, double num2) {
        System.out.println("Multiplication of double values is " + (num1 * num2));
    }

    public void divide(int num1, int num2) {
        System.out.println("Division of Integers is " + (num1 / num2));
    }

    public void divide(double num1, double num2) {
        System.out.println("Division of double values is " + (num1 / num2));
    }

}
