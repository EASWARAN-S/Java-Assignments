// Program to find a transpose of a matrix
import java.util.*;

public class TransposeOfMatrix {
    public static void main(String... args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of an array one by one");
        m = sc.nextInt();
        n = sc.nextInt();
         
        int[][] arr = new int[m][n];
        int[][] transpose = new int[n][m];
        //  Get the input   
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Original Matrix");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose of a 0 Matrix");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
        

    }

}
