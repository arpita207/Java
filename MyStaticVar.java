class MyStaticVar
{
	int rollNo;
	String name;
	static String college = "Scottish";
	MyStaticVar(int r , String n)
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
		MyStaticVar s1 = new MyStaticVar(1,"Suman");
		MyStaticVar s2 = new MyStaticVar(2,"Kiran");
		s1.display();
		s2.display();
	}
}