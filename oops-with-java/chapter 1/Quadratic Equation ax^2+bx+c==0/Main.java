/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Value of Quadratic Equation to find Roots : ");
        System.out.print("a :  ");
        int a = kb.nextInt();
        System.out.print("b :  ");
        int b = kb.nextInt();
        System.out.print("c :  ");
        int c = kb.nextInt();
        
        
        double d = Math.sqrt(b*b - 4*a*c);

        if (d>0){
            double Root_1 = (b+d)/(2*a);
            double Root_2 = (b-d)/(2*a);
            System.out.println("The two roots of Quadratic Equations is :-  "+Root_1+" and "+Root_2+" ");   
        }
        else if(d == 0){
            double Root_1 = b/(2*a);
            System.out.println("The two equal roots of Quadratic Equations is ( Root_1 == Root_2 ) :-  " +Root_1); 
        }
        else {
            System.out.println("This quadratic Equation gives a Imaginary Number .");
        }
        kb.close();


    }
}
