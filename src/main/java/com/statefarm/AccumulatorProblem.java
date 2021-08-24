package com.statefarm;

public class AccumulatorProblem {

    public static void main(String[] args) {
        String[] names = {""};
        String result = toSentence(names);
        System.out.println(result);

        String[] namesList = {};
        String result2 = toSentence(names);
        System.out.println(result2);

        String[] namesL = {"Alice", "Bob"};
        String result3 = toSentence(namesL);
        System.out.println(result3);

        String[] fiveNamesList = {"Alice", "Bob", "Peter", "Chris", "Rock"};
        String result4 = toSentence(fiveNamesList);
        System.out.println(result4);

    }

    public static String toSentence (String[] names) {
        String result = "";
        if(names.length == 0 || names[0] == ""){
            return "";
        }

        String comma = ", ";
        String andWord = " and ";

        if(names.length == 2) {
            result += names[0] + andWord + names[1];
        }

        for (String currentName : names) {
            result += currentName;
            // use comma when there is more than 3 names
            if(names.length > 3) {
                result += comma;
            }

            // use and before the last name
            String lastnameInList = names[names.length -1];
            if(currentName.equals(lastnameInList)) {
                result += andWord;
            }
        }
        return result;
    }

}
