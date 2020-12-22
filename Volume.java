import java.util.*;
class Volume
{
	public static void main(String args[])
	{
		System.out.println("Enter length breadth and height:");
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		if(l<0 || b<0 ||h<0)
		{
			System.out.println("INVALID INPUT");
			System.exit(1);
		}
		Box obj=new Box(l,b,h);
		double volume=obj.volume();
		System.out.println("The volume is:"+volume);
	}
}

class Box
{
	double l,br,h,vol;
	Box(double a, double breadth, double c)
	{
		l=a;
		br=breadth;
		h=c;
	}
	double volume()
	{
		vol=l*br*h;
		return vol;
	}
}