package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type some full sentences: ");
        String myString = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//        String myString = "If the product of two terms is zero then common sense " +
//                "says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into a " +
//                "form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> characterHashMap = new HashMap<>();

        for (char character : charactersInString) {

            if (characterHashMap.containsKey(character)) {
                characterHashMap.put(character, characterHashMap.get(character) + 1);
            } else {
                characterHashMap.put(character, 1);
            }

        }
//        int count = 1;
//
//        for (char character : charactersInString) {
//            if (characterHashMap.containsKey(character)) {
//                count++;
////                System.out.println(character + " " + count);
//
//            }
//
//            characterHashMap.put(character, count);
//
//        }

        System.out.println(characterHashMap);
    }
}
