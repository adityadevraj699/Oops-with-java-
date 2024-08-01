/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Work <T>
{
abstract T calc (T a, T b);
}
class Main 
{
public static void main(String args[])
{
Work <Integer> obj=new Work<>()
{
public Integer calc(Integer a, Integer b)
{
return a+b;
}
};
System.out.print("Result is =" +obj.calc(10,50));
}
}
