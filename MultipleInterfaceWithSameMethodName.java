interface Printable
{
 	void print();
}
interface Showable
{
 	void print();
}

class MultipleInterfaceWithSameMethodName implements Printable, Showable
{
	public void print()
 	{
 		System.out.println("Hello");
 	}
 	public static void main(String args[])
	{
 		MultipleInterfaceWithSameMethodName obj = new MultipleInterfaceWithSameMethodName ();
 		obj.print();
 	}
} 