/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class ForEach
{
public static void main(String args[])
{
ArrayList <String> num=new ArrayList<String>();
num.add("Amit");
num.add("Nitin");
num.add("Ravi");
num.add("Abhishek");
num.add("Deepika");
num.forEach((n)-> print(n));
}
public static void print(String n)
{
System.out.println("Student name" +n);
}
}