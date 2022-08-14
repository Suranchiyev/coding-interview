package com.company;

public class PalindromeQuestions {
    public static void main(String[] args) {
        System.out.println(isStrPal("anna")); // true
        System.out.println(isStrPal("civic")); // true
        System.out.println(isStrPal("apple")); // false
        System.out.println(isStrPal("level")); // true
        System.out.println(isStrPal("Bek")); // false

        System.out.println("--------");
        System.out.println(isNumPal(323)); // true
        System.out.println(isNumPal(-323)); // true
        System.out.println(isNumPal(123)); // false
        System.out.println(isNumPal(3342433)); // true
        System.out.println(isNumPal(12345)); // false
    }

    /**
     * isNumPal(323)     -> true
     * isNumPal(123)     -> false
     * isNumPal(3342433) -> true
     * isNumPal(12345)   -> false
     */
    public static boolean isNumPal(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            reverse = (reverse * 10) + num % 10;
            num = num / 10;
        }

        return reverse == original;
    }

    /**
     * isStrPal("anna");  -> true
     * isStrPal("civic"); -> true
     * isStrPal("apple"); -> false
     * isStrPal("level"); -> true
     * isStrPal("Bek");   -> false
     */
    public static boolean isStrPal(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
