package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMap2 {

    public static void main(String[] args) {
        java.util.HashMap<Integer, String> generatedArgs = genHashMap();
        //System.out.println(generatedArgs.get());
    }
        public static java.util.HashMap<Integer, String> genHashMap() {
            java.util.HashMap<Integer, String> generateHashMap = new java.util.HashMap<>();

            generateHashMap.put(747, "Airplane");
            generateHashMap.put(10, "Laphroaig");
            String item = generateHashMap.get("747");
            String item2 = generateHashMap.get("10");
            System.out.println(generateHashMap);
            return generateHashMap;
    }
}
