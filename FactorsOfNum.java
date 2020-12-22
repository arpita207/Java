//Write a program which will take a number and find out the factors of that number

import java.util.*;
class FactorsOfNum
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to find its factors:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("INVALID INPUT");
			System.exit(1);
		}
		Factors obj=new Factors();
		obj.show(n);
	}
}

class Factors
{
	public void show(int n)
	{
		System.out.println("The factors are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+",");
		}
	}
}