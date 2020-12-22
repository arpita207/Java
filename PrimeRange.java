//Write a program which will take a range and find the prime numbers between that range
//A prime number is one that is divisible by only 1 and itself

import java.io.*;
class PrimeRange
{
	static String str1;
	static String str2;
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the range within which you want to find the prime numbers:");
		DataInputStream r = new DataInputStream(System.in);
		str1=r.readLine();
		str2=r.readLine();
		int r1=Integer.parseInt(str1);
		int r2=Integer.parseInt(str2);
		if(r1<0 && r2<0 || r1>r2)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}				
		Prime obj = new Prime(r1,r2);         //creating object of class Prime
		System.out.println("The prime numbers between range "+r1+" and "+r2+" is:");
		obj.show();
	}
}

class Prime
{
	int r1,r2;
	Prime(int a,int b)          //parameterized constructor
	{
		r1=a;
		r2=b;
	}
	public void show()
	{
		for(int i=r1;i<=r2;i++)
		{
			int c=0;
			if(i<=1)                       
				continue;
			else if(i==2)
				System.out.println(i);
			else
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
					
						
				}
				if(c==0)
					System.out.println(i);
			}
		}
	}
}