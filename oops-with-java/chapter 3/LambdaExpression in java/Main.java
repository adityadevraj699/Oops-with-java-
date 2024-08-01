/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Sayable
{
public String say(String name);

}
interface Add{
    int add(int a, int b);
}
class Main
{
public static void main(String args[])
{
Sayable s=name-> "I have nothing " +name;
System.out.println(s.say("Aditya"));
Sayable s1=name-> "I have nothing " +name;
System.out.println(s1.say("Devraj"));
Add d=(a,b)-> (a+b);
System.out.println(d.add(20,25));

}
}
