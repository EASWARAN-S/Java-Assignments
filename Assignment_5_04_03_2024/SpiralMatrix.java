// Program to print the spiral matrix
import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimnesion of the matrix: ");
		int n=sc.nextInt();
		int arr[][]= new int[n][n];
		int rows=0;  int rows1=n-1;
		int cols=0;  int cols1=n-1;
		int num=1;
		while(num<=n*n)
		{
			for(int i=cols;i<=cols1;i++)
			{
				arr[rows][i]=num;
				num++;
			}
			rows+=1;
			
			for(int j=rows;j<=rows1;j++)
			{
				arr[j][cols1]=num;
				num++;
			}
			cols1-=1;
			

			for(int i=cols1;i>=cols;i--)
			{
				arr[rows1][i]=num;
				num++;
			}
			rows1-=1;

			for(int i=rows1;i>=rows;i--)
			{
				arr[i][cols]=num;
				num++;
			}
			cols+=1;

			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
}
