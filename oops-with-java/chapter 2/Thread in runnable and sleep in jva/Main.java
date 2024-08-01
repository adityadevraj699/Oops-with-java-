/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Aditya kumar!");
            try {
               
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        } 
    }
}

class B implements Runnable {
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Rishu Gupta.......!!");
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread B interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        Runnable runnableA = new A();
        Runnable runnableB = new B();
        
       
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        
        
        threadA.start();
        threadB.start();
        
       
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        
    }
}
