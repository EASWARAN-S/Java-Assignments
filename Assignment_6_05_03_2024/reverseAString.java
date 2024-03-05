// program to count vowels in a given string using string functions

import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String :");
		
		String str1= sc.nextLine();

		String newStr="";
		for(int i=0;i<str1.length();i++)
		{
			newStr+= str1.substring((str1.length()- 1 -i),(str1.length()-i));
		}
		System.out.println("Reverse of a String : " + newStr);
			
    }
}
