import java.util.Scanner;
class LibraryMember
{
	Scanner sc=new Scanner(System.in);
	int memberId,phoneNo;
	String memberName,address;
	void read()
	{
		System.out.println("Enter member ID:");
		memberId=sc.nextInt();
		System.out.println("Enter member name:");
		memberName=sc.next();
		System.out.println("Enter phone no:");
		phoneNo=sc.nextInt();
		System.out.println("Enter address:");
		address=sc.next();
	}
	void display()
	{
		System.out.println("Member ID:"+memberId);
		System.out.println("Member name:"+memberName);
		System.out.println("Phone no:"+phoneNo);
		System.out.println("Address:"+address);
	}
	void getName()
	{
		System.out.println("Name of member:"+this.memberName);
	}
}
class Student extends LibraryMember
{
	Scanner sc=new Scanner(System.in);
	int rollNo;
	String stream;
	void read()
	{
		super.read();
		System.out.println("Enter roll no:");
		rollNo=sc.nextInt();
		System.out.println("Enter stream:");
		stream=sc.next();
	}
	void display()
	{
		super.display();
		System.out.println("Roll No:"+rollNo);
		System.out.println("Stream:"+stream);
		System.out.println("..............................\n");
	}
}
class Faculty extends LibraryMember
{
	Scanner sc=new Scanner(System.in);
	int facultyId;
	String designation;
	void read()
	{
		super.read();
		System.out.println("Enter faculty ID:");
		facultyId=sc.nextInt();
		System.out.println("Enter designation:");
		designation=sc.next();
	}
	void display()
	{
		super.display();
		System.out.println("FacultyId:"+facultyId);
		System.out.println("Designation:"+designation);
		System.out.println("..............................\n");
	}
}
class Library
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter total no. of persons data you want to enter:");
		int n=sc.nextInt();
		LibraryMember[] s=new LibraryMember[n];
		while(true)
		{
			System.out.println("\nEnter your choice.\n1. Enter Library member data\n2. Display Library member data\n3. Get name of member\n4. Exit");
			int ch=sc.nextInt();
			if(ch==1)
			{
				if(count==n)
				{
					System.out.println("NO MoRE DatA CaN Be InPut");
					continue;
				}
				else
				{
					while(count<n)
					{
						System.out.println("\nEnter your choice.\n1. Enter student data\n2. Enter faculty data\n3.Exit to previous menu");
						int choice=sc.nextInt();
					
						if(choice==1)
						{
							s[count]=new Student();
							s[count].read();
							count++;
						}
						else if(choice==2)
						{
							s[count]=new Faculty();
							s[count].read();
							count++;
						}
						else if(choice==3)
							break;
						else
							System.out.println("INVALID INPUT");
					}
				}
			}
			else if(ch==2)
			{
				if(count==0)
				{
					System.out.println("No data");
					continue;
				}
			
				else
				{
					System.out.println("..............................");
					System.out.println("Scottish church library");
					System.out.println("..............................\n");
					for(int i=0;i<count;i++)
					{
						s[i].display();
					}
				}
			}
			else if(ch==3)
			{
				if(count==0)
				{
					System.out.println("\nNo Member to get his/her name");
					continue;
				}
				else
				{
					int flag=0;
					System.out.println("\nEnter member id to find member name:");	
					int id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(s[i].memberId==id)
						{
							s[i].display();
							flag=1;
						}
					}
					if(flag==0)
						System.out.println("No member name found with that member id");
				}
			}	
			else if(ch==4)
				break;
			else
				System.out.println("INVALID INPUT");
		}
	}
}