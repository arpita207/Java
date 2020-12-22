//Java Program to divide a string in 'N' equal parts.

import java.util.Scanner;
class nParts
{  
	public static void main(String[] args) 
	{      
            	int n,epart,a=0,c,len;
		String str1;
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the String:  ");
        	str1 = sc.nextLine();
		len=str1.length();
		if(len<=0)
		{
			System.out.println("Invalid input. Enter String again");
			System.exit(1);
		}
		System.out.print("Enter the value of N:  ");
		n = sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}
		if(len % n == 0)
		{
			epart=len/n;
			c=epart;
			while(c <= len)
			{
				System.out.println(str1.substring(a,c));
				a=a+epart;
				c=c+epart;
			}
		}
		else
		{
			System.out.println("");
			System.out.println("String is not Divisible ");
		}
	}
}