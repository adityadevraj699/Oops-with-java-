/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


class ThreadPriorityExample extends Thread
{
public void run()
{
System.out.println("Inside the run() method");
}
}
class Main
{
public static void main(String args[])
{
ThreadPriorityExample t1=new ThreadPriorityExample();
ThreadPriorityExample t2=new ThreadPriorityExample();
ThreadPriorityExample t3=new ThreadPriorityExample();
System.out.println("Priority of thread t2 is : " +t2.getPriority());
System.out.println("Priority of thread t1 is : " +t1.getPriority());
System.out.println("Priority of thread t3 is : " +t3.getPriority());
t1.setPriority(6);
t2.setPriority(3);
t3.setPriority(9);
System.out.println("Priority of thread t1 is : " +t1.getPriority());
System.out.println("Priority of thread t2 is : " +t2.getPriority());
System.out.println("Priority of thread t3 is : " +t3.getPriority());
System.out.println("currentoly Executing the thread is : " +Thread.currentThread().getName());
System.out.println("Priority of main thread thread is : " +Thread.currentThread().getPriority());
Thread.currentThread().setPriority(10);
System.out.println("Currently executed the thread" +Thread.currentThread().getPriority());
}
}
