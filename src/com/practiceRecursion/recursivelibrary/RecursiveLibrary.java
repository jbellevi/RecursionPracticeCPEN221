package com.practiceRecursion.recursivelibrary;

import java.util.List;
import java.util.ArrayList;

public class RecursiveLibrary {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*factorial(n - 1);
    }

    public static int arraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return getSumArray(arr, arr.length - 1);
    }

    private static int getSumArray(int [] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + getSumArray(arr, index - 1);
    }

    public static int recamanSequence(int n) {
        List<Integer> recaman = new ArrayList<>();
        return -1;

    }

}
