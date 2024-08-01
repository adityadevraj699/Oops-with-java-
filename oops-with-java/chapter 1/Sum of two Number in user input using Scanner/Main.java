/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Adding of two number !");
		Scanner sc =new Scanner(System.in);
		System.out.print("Inter a first number :-  ");
		int a=sc.nextInt();
		System.out.print("Inter a Second number :-  ");
		int b=sc.nextInt();
		System.out.println("result is : "+(a+b));
		sc.close();
	}
}
