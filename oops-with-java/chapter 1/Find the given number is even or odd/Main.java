/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Find given number in even or odd !");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        String result = (a % 2 == 0) ? "Given number is even" : "Given number is odd";
        System.out.println(result);
        sc.close();
    }
}
