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
        } else {
            for (String currentName : names) {
                result += currentName;
                String secondToLastnameInList = names[names.length - 2];
                String lastName = names[names.length -1];
                // use comma when there is more than 3 names
                // do not add the comma after the 2nd to last name in the list or string
                if (names.length > 3 && !secondToLastnameInList.equals(currentName) && !lastName.equals(currentName)) {
                    result += comma;
                }

                // use and before the last name

                if (currentName.equals(secondToLastnameInList)) {
                    result += andWord;
                }
            }
        }
        return result;

    }

}
