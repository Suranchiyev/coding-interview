package com.company;

import java.util.Arrays;

public class StrAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("abc", "bca")); // true
        System.out.println(isAnagram("abc", "ccb")); // true
        System.out.println(isAnagram("aaa", "aaab")); // true
    }

    /**
     * isAnagram("listen", "silent")     -> true
     * isAnagram("triangle", "integral") -> true
     * isAnagram("abc", "bca")           -> true
     * isAnagram("abc", "ccb")           -> false
     * isAnagram("aaa", "aaab")          -> false
     */
    public static boolean isAnagram(String str, String str2) {
        char[] charArrOne = str.toCharArray();
        char[] charArrTwo = str2.toCharArray();
        Arrays.sort(charArrOne);
        Arrays.sort(charArrTwo);
        return Arrays.equals(charArrOne, charArrTwo);
    }

}
