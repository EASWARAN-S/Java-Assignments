import java.util.*;
public class EmailVerification 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the email :");
		String str=scan.next();      //sarvana1235@gmail.com
		int pos=str.lastIndexOf("@");
		boolean status=true;
		int dot=str.lastIndexOf(".");
		
		if(pos!=-1 && str.charAt(pos-1)!='.' &&str.charAt(pos-1)!='@'   && !str.substring(0,pos).matches("-?\\d+(\\.\\d+)?") && !str.startsWith(".")) // checking whether email starts with dot or it only has special character or
		{
			for(int i=0;i<pos;i++)
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'
										|| str.charAt(i)>=0 && str.charAt(i)<=9 || str.charAt(i)=='.' )
					status=true;
				else
				{
					status=false;
					break;
				}
				
			}
			if(str.substring(dot+1) instanceof String) status=true; // checking whether the last is string 
			else status=false;
		}
		else status=false;
		for(int i=pos+1;i<dot;i++) // checking whether a special character is present b/w @ to .
		{
			int c=(int)str.charAt(i);
			if(c>=32 && c<=47) 
			{
			status=false;
			break;
			}
		}
		if(status)
			System.out.println("Email is valid");
		else System.out.println("Email is not valid");
	}

}