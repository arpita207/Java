interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class TestInferface implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}

}
class MultipleInterface
{
	public static void main(String args[])
 	{
		TestInferface obj = new TestInferface();
 		obj.print();
 		obj.show();
 	}
} 