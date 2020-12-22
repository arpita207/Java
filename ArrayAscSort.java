//sorting elements of array in ascending

import java.util.*;
class ArrayAscSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want to enter:");
		int n=sc.nextInt();
		 
		if(n<=0)
		{
			System.out.print("Wrong choice.");
			System.exit(1);
		}
		int num[]=new int[n];
		System.out.println("\nEnter the numbers:");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		Sort obj=new Sort();
		obj.sorting(n,num);
		obj.disp(n,num);
	}
}
class Sort
{
	void sorting(int n, int num[])
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=0;
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
	}
	void disp(int n, int num[])
	{
		System.out.println("\nThe sorted order name list is:");
		for(int i=0;i<n;i++)
			System.out.println(num[i]);
	}
}