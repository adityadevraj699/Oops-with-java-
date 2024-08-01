/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // ArithmeticException
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = sc.nextInt();
            System.out.println("Result: " + (100 / divisor));

            // NullPointerException
            String str = null;
            System.out.println(str.length());

            // StringIndexOutOfBoundsException
            System.out.print("Enter a string: ");
            sc.nextLine(); // Consume newline left-over
            String inputString = sc.nextLine();
            System.out.println("Character at index 5: " + inputString.charAt(5));

            // ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            System.out.println("Accessing 6th element: " + array[5]);

            // NumberFormatException
            System.out.print("Enter a non-numeric string: ");
            String nonNumericString = sc.nextLine();
            int num = Integer.parseInt(nonNumericString);
            System.out.println("Parsed number: " + num);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to access a null object.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: String index is out of bounds.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
