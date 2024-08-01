/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;

public class Main{
    public static void main(String[] args) {
        try (FileOutputStream fr = new FileOutputStream("abc.txt")) {
            String text = "I am Aditya Kumar from Meerut.\n I am student of \n      MEERUT INSTITUTE OF TECHNOLOGY .";
            byte[] b = text.getBytes();
            fr.write(b);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
             FileOutputStream r = new FileOutputStream("ded.txt")) {
            String p;
            while ((p = br.readLine()) != null) {
                byte[] arr = p.getBytes();
                r.write(arr);
                r.write('\n');
            }
            System.out.println("Successfully copied content to ded.txt!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
