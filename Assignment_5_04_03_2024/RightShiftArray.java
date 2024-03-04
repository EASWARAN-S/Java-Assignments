import java.util.Arrays;
import java.util.Scanner;

public class RightShiftArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the numbe of rotation :");
		int [] result= new int[arr.length];
		int ro=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			{
				int temp=(ro+i)%arr.length;
				result[temp]=arr[i];
			}
		System.out.println(Arrays.toString(result));
}

}
