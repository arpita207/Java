import java.io.*;
import java.lang.Math;
import java.util.Scanner;

class MyPoint
{
	int x,y;
	MyPoint()
	{
		x=0;
		y=0;
	}
	MyPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	int[] getXY()
	{
		int arr[]=new int[]{x,y};
		return arr;
	}
	public String toString()
	{
        	return "(" + x + "," + y + ")";
    	}
	void distance(int x1,int y1)
	{
		System.out.println("Distance is"+Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2)));
	}
}
class TestMyPoint
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		MyPoint obj=new MyPoint();
		while(true)
		{
			System.out.println("\n1. Set coordinates. \n2. Get coordinates\n3. Find distance\n4.Exit");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("\nenter the values of X and y:");
				int x=sc.nextInt();
				int y=sc.nextInt();
				obj.setXY(x,y);
				System.out.println(obj);
			}
			else if(ch==2)
			{
				int[] arr = obj.getXY();
				System.out.println("Coordinates are:");
				for(int i = 0; i < arr.length; i ++)
				{
            				System.out.println(arr[i]);
        			}
			}
			else if(ch==3)
			{
				System.out.println("enter another set of values of X1 and y1:");
				int x1=sc.nextInt();
				int y1=sc.nextInt();
				obj.distance(x1,y1);
			}
			else if(ch==4)
			{
				System.exit(1);
			}
			else
				System.out.println("wrong choice");
		}
	}
}