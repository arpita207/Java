#second smallest

import java.util.Scanner;
class Second
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