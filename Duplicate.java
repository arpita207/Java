import java.util.*;
class Duplicate
{
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to input in array:");		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter elemment of arr["+i+"]");
			arr[i]=sc.nextInt();
		}
		Count obj=new Count(n);
		obj.dulCount(n,arr);
		obj.show(n);
	}
}
class Count
{
	int co=0;
	int num[]=new int[20];
	int c[]=new int[20];
	Count(int a)
	{
		for(int i=0;i<a;i++)
		{
			num[i]=0;
			c[i]=0;
		}
	}
	void dulCount(int n,int array[])
	{
		for(int i=0;i<n;i++)
		{
			int temp=0;
			for(int j=0;j<n;j++)
			{
				if(num[j]==array[i])
				{
					c[j]++;
					temp=1;
				}
			}
			if(temp==0)
			{
				num[co]=array[i];
				c[co]=1;
				co+=1;
			}
		}	
	}
	void show(int n)
	{
		System.out.println("The count of each element in the array is:");
		for(int i=0;i<co;i++)
		{
			System.out.println(num[i]+" occurs "+c[i]+" times ");
		}
	}
}