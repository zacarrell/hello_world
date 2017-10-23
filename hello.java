// a simple program to practice common Github commands 
import java.util.Scanner;

public class hello {

    public static void main(String [] args) {

        System.out.println("Hello Class!");

		Scanner reader = new Scanner(System.in);
		System.out.println("Hi there!  What's your name?  ");
		String name = reader.next();
		
		System.out.println("Hey, " + name + "!  My name is Zac.");
		
    }
}

