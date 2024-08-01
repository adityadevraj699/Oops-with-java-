import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Writing to the file
        try (FileWriter f = new FileWriter("text2.txt")) {
            f.write("Hello, I am Aditya Devraj\nAnd I am a student of B.Tech.");
            System.out.println("Successfully written to the file.");
        } catch (IOException i) {
            System.out.println("An error occurred during file writing: " + i.getMessage());
        }

        // Reading from the file
        try (FileReader r = new FileReader("text2.txt")) {
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\nSuccessfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }

       
       
    }
}
