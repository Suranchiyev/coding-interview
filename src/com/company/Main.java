package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String[] arr = {"apple", "banana", "kiwi"};
	    // TODO create map where key is the arr element of element and map value is length of the arr element
        // {apple=5, banana=6, kiwi=4}
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String element : arr) {
            map.put(element, element.length());
        }
        System.out.println(map);

        int[] numArr = {2, 3, 5, 8, 9, 11, -1};
        int[] numArrTwo = {99, 67, 8, 2, 1};

        // TODO create third array which will have all the elements from both arrays and find total sum
        int[] thirdArr = new int[numArr.length + numArrTwo.length];
        System.out.println(Arrays.toString(thirdArr));

        int index = 0;
        for (int num : numArr) {
            thirdArr[index++] = num;
        }

        for (int num : numArrTwo) {
            thirdArr[index++] = num;
        }

        int sum = 0;
        for (int num : thirdArr) {
            sum += num;
        }
        System.out.println(Arrays.toString(thirdArr));
        System.out.println(sum);
    }
}
