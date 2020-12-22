interface printable
{
 	void print();
}
class MyPrint implements printable
{
 	public void print()
 	{
 		System.out.println("Hello");
 	}
}
class MyInterface
{
 	public static void main(String args[])
 	{
		MyPrint obj = new MyPrint();
 		obj.print();
 	}
}
