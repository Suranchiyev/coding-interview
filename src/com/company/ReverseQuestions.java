package com.company;

import java.util.Arrays;

public class ReverseQuestions {
    public static void main(String[] args) {
        System.out.println(revStr("hello"));
        System.out.println(revStr("apple"));
        System.out.println(revStr("hello"));

        String[] arr = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr));
        revArr(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(revWords("Java is the best")); // best the is Java
        System.out.println(revWords("I am John Doe")); // Doe John am I

        System.out.println(revNumber(123));
        System.out.println(revNumber(72));
        System.out.println(revNumber(13));
        System.out.println(revNumber(5));
    }

    /**
     * revNumber(123) -> 321
     * revNumber(72)  -> 27
     * revNumber(13)  -> 31
     * revNumber(5)   -> 5
     * we cannot convert this to String
     *
     * - to get the last number, we need to % by 10
     * - to remove the last number, we need to / by 10
     */
    public static int revNumber(int num) {
        int res = 0;
        while (num != 0) {
            res = (res * 10) + num % 10;
            num = num / 10;
        }
        return res;
    }

    /**
     * revWords("Java is the best") -> "best the is Java"
     * revWords("I am John Doe")    -> "Doe John am I"
     */
    public static String revWords(String content) {
        // split by space to get each word as array
        String[] words = content.split(" ");

        // iterate from the back of the array and build new string in reverse word order
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }

        return res.toString().trim();
    }

    /**
     * revStr("hello") -> olleh
     * revStr("apple") -> elppa
     * revStr("John")  -> nhoJ
     */
    public static String revStr(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
        // return new StringBuilder(str).reverse().toString();
    }

    /**
     *  revArr(["A", "B", "C", "D"]) -> ["D", "C", "B", "A"]
     */
    public static void revArr(String[] arr) {
        int end = arr.length - 1;
        for (int start = 0; start < arr.length / 2; start++, end--) {
            String tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
    }
}
