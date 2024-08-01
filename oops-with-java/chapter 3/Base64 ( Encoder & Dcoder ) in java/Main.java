/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java .util.*;
    public class Main
    {
    public static void main(String args[])
    {
        String sample="India team win the t20 world cup";
        System.out.println("Sample string: \n" +sample);
        String BasicBase64format=Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Encoded string is \n" +BasicBase64format);
        byte[] actualByte=Base64.getDecoder().decode(BasicBase64format);
        String actualString=new String(actualByte);
        System.out.println("actual string is \n" +actualString);
    }
    }
