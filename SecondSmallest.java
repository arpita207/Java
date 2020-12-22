//second smallest

import java.util.Scanner;
class SecondSmallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want to enter:");
		int n=sc.nextInt();
		int num[]=new int[n]; 
		if(n<=0)
		{
			System.out.print("Wrong choice.");
			System.exit(1);
		}
		System.out.println("\nEnter the numbers:");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		SecSmallest obj=new SecSmallest(0,0);
		obj.second(n,num);
	}
}
class SecSmallest
{
	int secondSmall,smallest;
	SecSmallest(int s, int ss)
	{
		smallest=s;
		secondSmall=ss;
	}
	void second(int n,int num[])
	{
		if(num[0]<num[1])
		{
			smallest=num[0];
			secondSmall=num[1];
		}
		else
		{
			smallest=num[1];
			secondSmall=num[0];
		}
		for(int j=2;j<n;j++)
		{
			if(num[j]<smallest)
			{
				secondSmall=smallest;
				smallest=num[j];
			}
			else if(num[j]>smallest && num[j]<secondSmall)
				secondSmall=num[j];
		}
		System.out.println("\nThe second smallest number in the array is:"+secondSmall);
	}
}