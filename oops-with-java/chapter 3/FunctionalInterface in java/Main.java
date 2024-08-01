/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
@FunctionalInterface
    interface Sayble
    {
    void say (String msg);
    default void sayBye()
    {
    System.out.println("Bye");
    }
    }
    class FunctionalInterface12 implements Sayble
    {
    public void say(String msg)
    {
    System.out.println(msg);
    }
    }
    public class Main 
    {
    public static void main(String args[])
    {
    FunctionalInterface12 obj=new FunctionalInterface12();
    obj.say("Hello How are you");
    obj.sayBye();
    }
    }
    
    