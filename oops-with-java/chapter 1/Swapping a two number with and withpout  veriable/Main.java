/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String agrs[])
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter two number for swapping :- ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        System.out.println("before swapping value is :-");
        System.out.println("a :-  " +a);
        System.out.println("b :-  " +b);

        int c;

        c=a;
        a=b;
        b=c;

        /*
        a= a+b;    without third variable;
        b= a-b;
        a= a-b
        */ 


        System.out.println("After Swapping value is :-");
        System.out.println("a :-  " +a);
        System.out.println("b :-  " +b);
    }
}

