
//  Program to Initialize a jagged array with N rows with weights of N persons. Each person can have different number of weights
import java.util.Scanner;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Persons : ");
        int n = sc.nextInt();
		int arr[][]=new int[n][];
		int res[][] = null;
		for(int x=0;x<arr.length;x++) 
		{
			System.out.println("Enter the Person's number to add weight");
			int person=sc.nextInt();
			if(person>=0 && person<=arr.length-1)
				arr=addWeight(person,arr);
			else 
				System.out.println("Enter a valid Person number from 0-"+(arr.length-1));
		}		
		System.out.println("Enter the Person's number to find the min weight");
		int findMin=sc.nextInt();
		int result=findMinWeight(findMin,arr);
		System.out.println("Minimum weight of the "+findMin+" person is "+result);
	}

	/*  To add the number of weight for nth person */ 
	static int[][] addWeight(int p,int a[][])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of weights you want to add for PERSON:"+p);
		int num=sc.nextInt();
		a[p]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[p][i]=sc.nextInt();
		}
		return a;
	}

	// to find the minimum weight of the person

	static int findMinWeight(int person,int b[][])
		{
				int minimum=b[person][0];
				if (b!=null);
				{
					for(int i=0;i<b[person].length;i++)
					{
						minimum=Math.min(minimum,b[person][i]);
					}
					return minimum;
				}
			}

}