import java.util.Scanner;
abstract class Animal
{
	String Species, Kingdom;
    	int Lifespan;
    	static boolean tame;
    	abstract void printDetails();
    	abstract void speak();
    	static boolean canBeTamed()
	{
        	return tame;
    	}
}
class Dog extends Animal
{
    	Scanner input = new Scanner(System.in);
    	String name, breed, noise = "Woof!!!";
    	int speed;
    	void read()
	{
        	System.out.print("Enter the name of your dog: ");
        	name = input.next();
        	System.out.print("Enter its Breed: ");
        	breed = input.next();
        	System.out.print("Enter its Speed: ");
        	speed = input.nextInt();
        	System.out.print("Enter the Species: ");
        	Species = input.next();
        	System.out.print("Enter the Kingdom: ");
        	Kingdom = input.next();
        	System.out.print("Enter the Life Span: ");
        	Lifespan = input.nextInt();
        	System.out.print("Can be tame ?, 1 for yes, 0 for no: ");
        	int sChoice = input.nextInt();
        	if(sChoice == 1)
		{
            		Animal.tame = true;
        	}
        	else if(sChoice == 0)
		{
            		Animal.tame = false;
        	}
    	}
    	void printDetails()
	{
        	System.out.println("Name: "+ name);
        	System.out.println("Breed: "+ breed);
        	System.out.println("Speed: "+ speed);
        	System.out.println("Species: "+ Species);
        	System.out.println("Kingdom: "+ Kingdom);
        	System.out.println("Lifespan: "+ Lifespan);
        	boolean check = super.canBeTamed();
        	if(check == true)
            		System.out.println(name+" Can be Tamed");
        	else
            		System.out.println(name+" Cannot be Tamed");
    	}
    	void speak()
	{
        	System.out.println(name + " said " + noise);
    	}
}

class Cat extends Animal
{
    	Scanner input = new Scanner(System.in);
    	String name, breed, noise = "Meow!!";
    	int speed;
    	void read()
	{
        	System.out.print("Enter the name of your cat: ");
        	name = input.next();
        	System.out.print("Enter its Breed: ");
        	breed = input.next();
        	System.out.print("Enter its Speed: ");
        	speed = input.nextInt();
        	System.out.print("Enter the Species: ");
        	Species = input.next();
        	System.out.print("Enter the Kingdom: ");
        	Kingdom = input.next();
        	System.out.print("Enter the Life Span: ");
        	Lifespan = input.nextInt();
        	System.out.print("Can be tame ?, 1 for yes, 0 for no: ");
        	int sChoice = input.nextInt();
        	if(sChoice == 1)
		{
            		Animal.tame = true;
        	}
        	else if(sChoice == 0)
		{
            		Animal.tame = false;
        	}
    	}	
    	void printDetails()
	{
        	System.out.println("Name: "+ name);
        	System.out.println("Breed: "+ breed);
        	System.out.println("Speed: "+ speed);
        	System.out.println("Species: "+ Species);
        	System.out.println("Kingdom: "+ Kingdom);
        	System.out.println("Lifespan: "+ Lifespan);
        	boolean check = super.canBeTamed();
        	if(check == true)
            		System.out.println(name+" Can be Tamed");
        	else
            		System.out.println(name+" Cannot be Tamed");
    	}
    	void speak()
	{
        	System.out.println(name + " said " + noise + "!");
    	}
}
public class AnimalNoise 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        	Dog d = new Dog();
        	Cat c = new Cat();
		d.read();
        	c.read();
		while(true)
		{
			System.out.println("ENTER YOUR CHOICE.\n1. PRINT DETAILS\n2. SOUND OF ANIMAL\n3. EXIT");
			int ch=input.nextInt();
			if(ch==1)
			{
				System.out.println("----------DEtAILS----------");
        			d.printDetails();
        			System.out.println("-------------------------------");
        			c.printDetails();
        			System.out.println("-------------------------------");
			}
			else if(ch==2)
			{
				System.out.println("-----------SOUND----------");
				d.speak();
				c.speak();
			}
			else if(ch==3)
				System.exit(1);
			else
			{
				System.out.println("wrong choice");
				System.exit(1);

			}
		}
    }
}