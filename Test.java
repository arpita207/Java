import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream st=new DataInputStream(System.in);
		String str=st.readLine();
		int k=Integer.parseInt(str);
		System.out.print("number="+k);
	}
} 