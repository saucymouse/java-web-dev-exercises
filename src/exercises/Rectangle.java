package exercises;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rectangle's length:");
        int length = input.nextInt();
        System.out.println("Please enter the rectangle's width:");
        int width = input.nextInt();
        input.close();

        int area = width * length;
        System.out.println("The area of the rectangle is: " + area);
    }
}
