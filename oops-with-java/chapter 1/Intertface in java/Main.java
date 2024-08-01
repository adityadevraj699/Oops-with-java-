/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Drawable
{  
void draw();  
}  
class Rectangle implements Drawable
{  
public void draw()
{
System.out.println("drawing rectangle");
}  
}  
class Circle implements Drawable
{  
public void draw()
{
System.out.println("drawing circle");
}  
}  
class Main
{  
public static void main(String args[])
{  
Drawable d=new Circle();
Drawable e=new Rectangle();
d.draw();
e.draw();  
}
}  