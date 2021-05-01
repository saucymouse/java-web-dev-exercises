package exercises;
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float miles = input.nextFloat();
        System.out.println("How much gas have you used?");
        float gas = input.nextFloat();
        input.close();

        float mileage = miles/gas;
        System.out.println("You got " + mileage + " miles per gallon");
    }
}
