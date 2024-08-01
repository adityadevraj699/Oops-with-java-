/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java Program to demonstrate
// Java Encapsulation

// Person Class
class Person {
	// Encapsulating the name and age
	// only approachable and used using
	// methods defined
	private String name;
	private int age;

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
}

// Driver Class
public class Main{
	// main function
	public static void main(String[] args)
	{
		// person object created
		Person person = new Person();
		person.setName("Aditya");
		person.setAge(21);

		// Using methods to get the values from the
		// variables
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}
