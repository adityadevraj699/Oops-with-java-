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
        System.out.println("Enter any number to check prime or not :- ");
        int n=obj.nextInt();
        boolean prime = prime(n);
        if(prime){
            System.out.println("YES! number is prime : "+n);
        }
        else{
            System.out.println("NO! number is not prime : "+n);
        }
        obj.close();
    }
    public static boolean prime(int n){
        int i;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                break;
            }
        }
        if(i==n/2+1){
            return true;
        }
        else{
            return false;
        }
    }
}
