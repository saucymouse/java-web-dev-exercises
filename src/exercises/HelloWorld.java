package exercises;

//import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
