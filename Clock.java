import java.util.*;
class Clock
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter hours:");
		int hour=sc.nextInt();
		System.out.println("Enter minutes:");
		int minute=sc.nextInt();
		System.out.println("Enter seconds:");
		int sec=sc.nextInt();
		Valid obj=new Valid(hour,minute,sec);
		obj.hourCheck();
	}
}

class Valid
{
	int hour,min,sec;
	Valid(int h, int m, int s)
	{
		hour=h;
		min=m;
		sec=s;
	}
	void hourCheck()
	{
		if(sec<0||min<0||hour<0)
		{
			System.out.println("INVALID INPUT ");
			System.exit(1);
		}
		if(sec>60)
		{
			min=min+(sec/60);
			sec=sec%60;
		}
		if(min>60)
		{
			hour=hour+(min/60);
			min=min%60;
		}
		if(hour<=12)
			System.out.println("The Valid hour is "+hour+":"+min+":"+sec+"AM");
		if(hour>=24 && min>0)
		{
			hour=hour-24;
			System.out.println("The Valid hour is "+hour+":"+min+":"+sec+"AM");
		}
		if(hour>12 && hour<=24)
		{
			hour=hour-12;
			System.out.println("The Valid hour is "+hour+":"+min+":"+sec+"PM");
		}
		
	}
}
			
		