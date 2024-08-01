/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to reverse :- ");
        int n=obj.nextInt();
        int res=reverse(n);
        System.out.println("Reverse number of "+n+" is :-  "+res);
        obj.close();
    }
    public static int reverse(int n){
        int a,res=0;
        while(n>0){
            a=n%10;
            res=res*10+a;
            n/=10;
        }
        return res;
    }
}
