/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Car
{
public abstract void fly();
public abstract void Drive();
public void playMusic()
{
System.out.println("Play Music");
}
}
abstract class Swift extends Car
{
public void Drive()
{
System.out.println("Driving");
}
}
class AutoSwift extends Swift
{
public void fly()
{
System.out.println("Flying");
}
}

class Main
{
public static void main(String []args)
{
Car obj=new AutoSwift();
obj.Drive();
obj.playMusic();
obj.fly();
}
}