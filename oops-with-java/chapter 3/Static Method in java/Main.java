/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
@FunctionalInterface
interface MyMath {  
    
    int calculate(int a, int b);  

   
    static double squareRoot(int num) {  
        return Math.sqrt(num);  
    }  
}  

public class Main {  
    public static void main(String[] args) {  
       
        MyMath addition = (a, b) -> a + b;  
        
       
        int result = addition.calculate(5, 11);  
        System.out.println("Result: " + result);  
  
        
        double sqrtResult = MyMath.squareRoot(25);  
        System.out.println("Square root: " + sqrtResult);  
    }  
}
