class MyStaticMethod
{
	int rollNo;
	String name;
	static int count = 0;
	static String college = "SCC";
	static void change()
	{
		college = "Scottish Church College";
		//roll=13;
	}
	MyStaticMethod(int r, String n)
	{
		rollNo = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollNo + " " + name + " " + college);
	}
	public static void main(String argv[])
	{
		//MyStaticMethod.change();
		MyStaticMethod s1 = new MyStaticMethod(1,"bb");
		MyStaticMethod s2 = new MyStaticMethod(2,"sss");
		s1.display();
		s2.display();
	}
}