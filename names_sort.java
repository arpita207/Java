import java.util.*;
class names_sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of names you want to enter:");
		int n=sc.nextInt();
		String names[]=new String[n]; 
		if(n<=0)
		{
			System.out.print("Wrong choice.");
			System.exit(1);
		}
		System.out.println("\nEnter the names:");
		for(int i=0;i<n;i++)
		{
			names[i]=sc.next();
		}
		Sort obj=new Sort();
		obj.sorting(n,names);
		obj.disp(n,names);
	}
}
class Sort
{
	void sorting(int n, String names[])
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				String temp="";
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
	}
	void disp(int n, String names[])
	{
		System.out.println("\nThe sorted order name list is:");
		for(int i=0;i<n;i++)
			System.out.println(names[i]);
	}
}