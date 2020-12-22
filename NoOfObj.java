class NoOfObj
{
	static int count=0;
	NoOfObj()
	{
		count=count+1;
	}
	public static void main(String args[])
	{
		NoOfObj obj1=new NoOfObj();
		NoOfObj obj2=new NoOfObj();
		System.out.println("count of objects= "+count);
	}
}