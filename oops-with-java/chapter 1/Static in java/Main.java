/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Student
{
int rollno;
String name;
static String college = "MIT";
static void change(){
    college= "MIET";
    System.out.println("in static ");
}
public Student()
{
rollno=1;
name = "Aditya";
System.out.println("IN constructor ");
}
void displayStudent()
{
System.out.println("Rollno : "+rollno+ " name : " +name+" college : "+college);
}
}
class Main
{
public static void main(String []args)
{
Student.change();
Student s=new Student();
Student s1=new Student();
s.displayStudent();
s1.displayStudent();
}
}

