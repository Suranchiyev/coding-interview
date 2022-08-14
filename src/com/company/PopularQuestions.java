package com.company;

import java.util.Random;

public class PopularQuestions {
    public static void main(String[] args) {
        String str = "apple";
        String str2 = "apple";
        String str3 = new String("apple");

        // == checks if two references are pointing to the same object or not
        System.out.println(str == str2); // true
        System.out.println(str == str3); // false
        System.out.println(str.equals(str3)); // true
        System.out.println("----------------");

        int i = 15;
        int j = 5;
        // swap values without using third variable
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i = i - j;
        j = i + j;
        i = j - i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("----------------");

        int num = new Random().nextInt(101);
        // TODO check if num is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        System.out.println("----------------");
    }
}
