package com.manjunath;

public class TestJava {
    public static void main(String[] args){
        System.out.println("java version: " + System.getProperty("java.version"));
        //java9 and later
        System.out.println("java version: " + Runtime.version());
        System.out.println("java version: " + Runtime.version().minor());
        System.out.println("java version: " + Runtime.version().pre());
        System.out.println("java version: " + Runtime.version().security());

    }
}
