// program to count vowels in a given string using string functions

import java.util.Scanner;

public class CountVowels 
{

    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String :");
		
		String str1= sc.nextLine();
		int count=0;
		String vowels="AEIOUaeiou";
		for(int i=0;i<str1.length();i++)
		{
			if(vowels.contains(str1.substring(i,i+1))) count++;
		}
		System.out.println("Number of vowels is :"+ count);
			
    }
    
}
