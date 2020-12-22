class TestCons
{
	public static void main(String arg[])
	{
		Example T1=new Example();
		T1.show();
		Example T2=new Example("Welcome to the world of java");
		T2.show();
	}
}
class Example
{
	private String str;
	Example()
	{
		str="Hello";
		System.out.println("Default Constructor Invoked");
	}
	Example(String s)
	{
		str=s;
		System.out.println("Parameterized constructor Invoked");
	}
	public void show()
	{
		System.out.println(str);
	}
}