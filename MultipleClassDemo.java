/* Program to create a mutiple class demo and see how many class file is generated  */

/* It is observed that the class file generated is equal to number of classes written in the program */

import java.util.*;

public class MultipleClassDemo {
    static void rearrange(int[] arr, int n) {
        int temp[] = arr.clone();
        int small = 0, large = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
    }

    public static void main(String[] args) {
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter the value for the array length ");
        int x = inObj.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the input one by one");
        for (int j = 0; j < x; j++) {
            arr[j] = inObj.nextInt();
        }

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, arr.length);

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
        TCDemo tc = new TCDemo();
        tc.typeConversion();
    }
}
  class TCDemo {
      public  void typeConversion() {
            Scanner inputObj = new Scanner(System.in);

            // Implicit type Conversion ..
            int num1 = 100;
            float num2 = num1;
            long num3 = num1;

            System.out.println("int value: " + num1);
            System.out.println("float value: " + num2);
            System.out.println("long value: " + num3);

            // Explicit Type Conversion....
            System.out.println("Enter the decimal value");
            double num4 = inputObj.nextDouble();
            System.out.println("long value: " + (long) num4);
        }
    }
