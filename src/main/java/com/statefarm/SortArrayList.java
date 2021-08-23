package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    //ArrayList<String> sortArray = new ArrayList<>();
    public static void main(String[] args) {
       ArrayList<String> sortedArgs = sortArray(args);
        System.out.println(sortedArgs.get(0));
    }
    public static ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedArray = new ArrayList<>(Arrays.asList(inputArray));
        sortedArray.sort(null);
        return sortedArray;
    }
}
