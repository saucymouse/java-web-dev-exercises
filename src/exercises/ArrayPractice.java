package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};
        for (int number : myArray) {
            if (number%2 == 1) {
                System.out.println(number);
            }
        }

        String mySentence = ("I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.");
        String[] mySentenceArray = mySentence.replace(",", "").replace(".", "").split(" ");
        System.out.println(Arrays.toString(mySentenceArray));

    }
}
