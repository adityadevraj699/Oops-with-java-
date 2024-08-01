/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print and display an Array!\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element at index %d: ", i);
            array[i] = sc.nextInt();
        }
        
        System.out.println("\nDisplaying array elements: ");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        
        sc.close();
    }
}

