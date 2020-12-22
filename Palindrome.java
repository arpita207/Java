//q.14, name: arpita das

import java.io.*;
class Palindrome
{
	public static void main(String args[])throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter string:");
		String st=d.readLine();
		st=st.toLowerCase();	
		int length=st.length();
		if(length==0)
		{
			System.out.println("No string entered");
			System.exit(1);
		}
		else
		{
			String st1="";
			for(int i=length-1;i>=0;i--)
			{
				st1=st1+st.charAt(i);
			}
			if(st.equals(st1))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
		}
	}
		

}