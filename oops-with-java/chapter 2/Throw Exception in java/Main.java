/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String args[])
	{
		int a,b;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			if((b<=0 || a<0))
				throw new ArithmeticException();
			int ans=a/b;
			System.out.println("The ans is:" +ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry we could divide both number should be non-zero positive");
		}
	}
}

