//Write a program which will take a range and find twin prime numbers between that range

import java.util.*;
class TwinPrime
{
	public static void main(String args[])
	{
		System.out.println("Enter the range within which you want to find the prime numbers:");
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		if(r1<0 && r2<0 || r1>r2)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}				
		Twin obj = new Twin();
		System.out.println("The twin prime numbers between range "+r1+" and "+r2+" is:");
		for(int i=r1;i<=(r2-2);i++)
		{
			if(i<=1)
				continue;
			else
			{
				if(obj.prime(i) == 1 && obj.prime(i+2) == 1)
					System.out.println(+i+","+(i+2));
			}
		}
	}
}

class Twin
{
	public int prime(int a)
	{
		int c=0;
		for(int j=2;j<a;j++)
		{
			if(a%j==0)
				c++;
		}
		if(c==0)
			return 1;
		else
			return 0;
	}
}