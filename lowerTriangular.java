//lower triangular matrix

import java.util.Scanner;
class lowerTriangular
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the matrix you want to enter:");
		int n=sc.nextInt();
		int num[][]=new int[n][n]; 
		if(n<=0)
		{
			System.out.print("Wrong choice.");
			System.exit(1);
		}
		System.out.println("\nEnter the numbers:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nThe given matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		lowTriMat l=new lowTriMat();
		l.mat(n,num);
	}
}
class lowTriMat
{
	void mat(int n,int num[][])
	{
		System.out.println("\nThe lower triangular matrix of given matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}