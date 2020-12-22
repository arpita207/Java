
import java.util.*;
class TestInheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of I:");
		int i=sc.nextInt();
		System.out.println("Enter the value of J:");
		int j=sc.nextInt();
		B b=new B();
		b.setData(i,j);
		int max=b.maxValue();
		int min=b.minvalue();
		System.out.println("maximum "+max);
		System.out.println("minimum "+min);
	}
}
class A
{
	private int i,j;
	A()
	{
		System.out.println("this is parent");
	}
	public void setData(int a,int b)
	{
		i=a;
		j=b;
	}
	public int getDataI()
	{
		return i;
	}
	public int getDataJ()
	{
		return j;
	}
}
class B extends A
{
	B()
	{
		System.out.println("This is child");
	}
	int maxValue()
	{
		int i=getDataI();
		int j=getDataJ();
		if(i>j)
			return i;
		else
			return j;
	}
	int minvalue()
	{
		int i=getDataI();
		int j=getDataJ();
		if(i<j)
			return i;
		else
			return j;
	}
}
