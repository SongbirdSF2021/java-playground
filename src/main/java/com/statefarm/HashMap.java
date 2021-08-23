package com.statefarm;



public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> numbers = new java.util.HashMap<String, Integer>();
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        Integer num = numbers.get("zero");
        Integer num2 = numbers.get("one");
        Integer num3 = numbers.get("two");
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(numbers);

    }

}
