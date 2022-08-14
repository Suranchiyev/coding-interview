package com.company;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyStrTwo {
    public static void main(String[] args) {
        //            0123456789....
        String str = "hi1234Hello564abc23465";
        // TODO reverse only strings and return together with numbers
        // ih123olleH564cba
        // [{0, 1}, {6, 10}, {15, 18}, {}]

        List<StringIndex> stringIndices = new ArrayList<>();

        int start = 0;
        int end = str.length() - 1;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                s += str.charAt(i);
            } else {
                if (!s.isEmpty()) {

                }
                s = "";
            }
        }

    }

    public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static class StringIndex {
        int startIndex;
        int endIndex;

        public StringIndex(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }
}
