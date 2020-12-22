//Java Program to determine whether a given matrix is an identity matrix

import java.util.Scanner;
class IdentityMat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the matrix you want to enter:");
		int n=sc.nextInt(); 
		if(n<=0)
		{
			System.out.print("Wrong choice.");
			System.exit(1);
		}
		int mat[][]=new int[n][n];
		System.out.println("\nEnter the numbers:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nThe given matrix is:\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		Identity obj=new Identity();
		obj.check(n,mat);
	}
}
class Identity
{
	int flag;
	void check(int n, int mat[][])
	{
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					if(mat[i][j]==1)
						flag=1;
					else
						flag=0;
				}
				else
				{
					if(mat[i][j]==0)
						flag=1;
					else
						flag=0;
				}
				if(flag==0)
				{
					System.out.println("Not an Identity matrix");
					System.exit(1);
				}
			}
		}
		if(flag==1)
			System.out.println("It is an Identity matrix");
	}
}