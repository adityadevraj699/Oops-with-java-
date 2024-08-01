/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package Aditya;  
import java.util.*;  
public class Add  
{  
int s;  
public void sum()  
{  
System.out.print("Enter the first number: ");  
Scanner scan=new Scanner(System.in);  
int x=scan.nextInt();  
System.out.print("Enter the second number: ");  
Scanner scan1=new Scanner(System.in);  
int y=scan1.nextInt();  
s=x+y;  
System.out.println("sum="+s);  
scan.close();
scan1.close();
}  
}  