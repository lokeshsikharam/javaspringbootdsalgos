package com.example.demo.coding;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Test class");
        Arrays.stream(new String[] {"test", "test2"}).forEach(System.out::println);
    }

}
