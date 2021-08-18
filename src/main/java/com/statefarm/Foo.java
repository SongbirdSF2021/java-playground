package com.statefarm;

public class Foo {
    public static void main(String[] args) {
        Object obj = new Foo();
        System.out.println(obj.toString());
    }
    @Override
    public String toString() {
        return "This is a NEW Object";
    }


}


