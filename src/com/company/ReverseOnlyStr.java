package com.company;

public class ReverseOnlyStr {
    public static void main(String[] args) {
        String str = "hi1234Hello564abc23465";
        // TODO reverse only strings and return together with numbers
        // ih123olleH564cba

        boolean doReverse = false;
        int startStrIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                if (!doReverse) {
                    startStrIndex = i;
                }

                doReverse = true;
            } else {
                if (doReverse) {
                    String rev = revStr(str.substring(startStrIndex, i));
                    String fPart = str.substring(0, startStrIndex);
                    String sPart = str.substring(i);
                    str = fPart + rev + sPart;
                }
                doReverse = false;
            }
        }

        if (doReverse) {
            String rev = revStr(str.substring(startStrIndex));
            String fPart = str.substring(0, startStrIndex);
            str = fPart + rev;
        }


        System.out.println(str);
    }

    public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
