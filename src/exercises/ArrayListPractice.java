package exercises;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.add(10);
//        System.out.println(getSum(myArray));

        ArrayList<String> myWordArray = new ArrayList<>();
        myWordArray.add("chocolate");
        myWordArray.add("pecan");
        myWordArray.add("straw");
        myWordArray.add("cookie");
        myWordArray.add("mint");

        printWord(myWordArray);


    }



    public static void printWord(ArrayList<String> myArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int selectedLength = input.nextInt();

        for (String word : myArray) {
            if (word.length() == selectedLength) {
                System.out.println(word);
            }
        }
    }
}
