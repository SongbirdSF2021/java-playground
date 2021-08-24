package com.statefarm;

public class AccumulatorPattern {
    public static void main(String[] args) {
        String[] pizza = {"d", "b", "y"};
        boolean result = containsVowel(pizza);
        System.out.println(result);

        String[] cake = {""};
        System.out.println(containsVowel(cake));
    }
    static boolean containsVowel(String[] input) {
        boolean vowelPresent = false;

        //if the empty case return the initial accumulator
        if(input.length == 0 || input[0] == "") {
            return vowelPresent;
        }

        String vowels = "aeiouy";

        //iterate through the array
        for(String character : input) {

            //check if character is a vowel
            if(vowels.contains(character)) {

                //alter the accumulator
                vowelPresent = true;
            }
        }
        return vowelPresent;
    }

}