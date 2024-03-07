public class Product {
    byte num1 = 125;
    short num2 = 185;
    int num3 = 1258;
    long num4 = 5L;
    float num5 = 56f;
    double num6 = 85.526;
    char character1 = 'a';

    void print() {
        System.out.println("number 1 is in byte datatype : " + num1);
        System.out.println("number 2 is in short  datatype : " + num2);
        System.out.println("number 3 is in int datatype : " + num3);
        System.out.println("number 4 is in long datatype : " + num4);
        System.out.println("number 5 is in float datatype : " + num5);
        System.out.println("number 6 is in double datatype : " + num6);
        System.out.println("Character is  : " + character1);

    }

    public static void main(String[] args) {
        Product P1 = new Product();
        P1.print();
    }
}
