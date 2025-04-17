package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Debug mode");

        String propertyValue = System.getProperty("greeting.language");
        System.out.println(propertyValue);
    }
}