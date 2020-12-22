//print palindrome number or not

import java.util.Scanner;
class PalindromeNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0,r=0,p=0,sum=0;
		System.out.println("Enter a number to check if it is palindrome or not:");
		int n=sc.nextInt();
		int num=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			count++;
		}
		if(sum==num)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome");	
	}
}