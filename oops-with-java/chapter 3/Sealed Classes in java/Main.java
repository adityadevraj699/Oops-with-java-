/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
sealed class Human permits Aditya, Rishu, Devraj 
{
public void info()
{
System.out.println("Hello B.Tech students i am Aditya");
}
}
non-sealed class Aditya extends Human
{
public void info()
{
System.out.println("Hello Frinds I am Aditya Kumar");
}
}
non-sealed class Rishu extends Human
{
public void info()
{
System.out.println("Hello Frinds I am Rishu");
}
}
non-sealed class Devraj extends Human
{
public void info()
{
System.out.println("Hello Frinds I am Devraj ");
}
}
class Main
{
public static void main(String args[])
{
Human h1=new Aditya();
Human h2=new Human();
h1.info();
h2.info();
Human h3=new Rishu();
h3.info();
Human h4=new Devraj();
h4.info();
}
}

