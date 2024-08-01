/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Polygon {

    // method to render a shape
    public void render() {
      System.out.println("Rendering Polygon...");
    }
  }
  
  class Square extends Polygon {
  
    // renders Square
    public void render() {
      System.out.println("Rendering Square...");
    }
  }
  
  class Circle extends Polygon {
  
    // renders circle
    public void render() {
      System.out.println("Rendering Circle...");
    }
  }
  
  class Main{
    public static void main(String[] args) {
      
      // create an object of Square
      Square s1 = new Square();
      s1.render();
  
      // create an object of Circle
      Circle c1 = new Circle();
      c1.render();
    }
  }

