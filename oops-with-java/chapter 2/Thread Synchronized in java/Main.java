/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Table
{
	
	synchronized void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+ " X " +i+ "=" +n*i);
		try
		{
		Thread.sleep(400);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(15);
	}
} 
class Main
{
	public static void main(String args[])
	{
		Table ob=new Table();
		MyThread1 t1=new MyThread1(ob);
		MyThread2 t2=new MyThread2(ob);
		t1.start();
		t2.start();
	}
}