/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Student
{
private int rollno;
private float marks;
public Student()
{
rollno=1;
marks=50.0f;
}
public Student(int r, float m)
{
rollno=r;
marks=m;
}
public void displayStudent()
{
System.out.println("Rollno : "+rollno+ " marks : " +marks);
}
}
class Main
{
public static void main(String []args)
{
Student s=new Student(101,45.6f);
Student s1=new Student();
s.displayStudent();
s1.displayStudent();
}
}