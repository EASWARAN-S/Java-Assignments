
// Program to find a transpose of a matrix
import java.util.*;

public class MatrixMultiplication {
    public static void main(String... args) {
        int m, n, p, q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the first array  one by one");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("Enter the rows and columns of the Second array  one by one");
        p = sc.nextInt();
        q = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[p][q];

        arr1 = input(m, n);
        arr2 = input(p, q);
        if (n != p) {
            System.out.println("Matrix multiplication can not be performed");
        } else {
            int[][] resultant = new int[m][q];
           
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < p; k++) {
                        resultant[i][j] += arr1[i][k] * arr2[k][j];

                    }
                }
            }

            printData(resultant, m, q);
        }
    }
    // Get the input

    static int[][] input(int i, int j) {
        System .out.println ("Enter the input for the array");
                Scanner sc = new Scanner(System.in);
        int[][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                arr[k][l] = sc.nextInt();
            }
        }

        return arr;

    }

    static void printData(int[][] arr, int i, int j) {
        System .out.println ("Matrix Multiplication is ");
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(arr[k][l]);
                System.out.print( " ");
            }
            System.out.println(" ");
        }

    }

}
