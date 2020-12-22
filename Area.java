//Write a program which calculate the area of square, rectangle and circle using method overloading

import java.io.*;
class Area
{
	public static void main(String args[])throws IOException
	{
		DataInputStream r = new DataInputStream(System.in);
		AreaTest obj=new AreaTest();
		while(true)
		{
			System.out.println("1.SQUARE\n2.RECTANGLE\n3.CIRCLE");
			String str=r.readLine();
			int ch=Integer.parseInt(str);
			if(ch==1)
			{
				System.out.println("Enter the side of square:");
				String str1=r.readLine();
				int s=Integer.parseInt(str1);
				obj.area(s);
			}
			else if(ch==2)
			{
				System.out.println("Enter the length and breadth of rectangle:");
				String str2=r.readLine();
				String str3=r.readLine();
				double a=Double.parseDouble(str2);
				double c=Double.parseDouble(str3);
				obj.area(a,c);
			}
			else
			{
				System.out.println("Enter the radius of circle:");
				String str4=r.readLine();
				double d=Double.parseDouble(str4);
				obj.area(d);
			}	
		}
	}
	
}

class AreaTest
{
	void area(int a)
	{
		int l=a;
		System.out.println("Area of square:");
		System.out.println(l*l);
	}
	void area(double a,double c)
	{
		double l=a;
		double b=c;
		System.out.println("Area of rectangle:");
		System.out.println(l*b);
	}
	void area(double a)
	{
		double r=a;
		System.out.println("Area of circle:");
		System.out.println(3.14*r*r);
	}
}