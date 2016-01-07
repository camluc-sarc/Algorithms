/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.algorithms.utils;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Cam
 */
public class SortUtils {

    /**
     * Create an array of integers. Values may duplicate.
     *
     * @param arrSize Array size
     * @param bound Max value
     * @return An unsorted array of integers
     */
    public static int[] createUnsortedArray(int arrSize, int bound) {
        if (arrSize < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }

        int[] arr = new int[arrSize];
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(bound);
        }
        return arr;
    }

    /**
     * Check if an array is already sorted in ascending order.
     *
     * @param arr An array of integers
     * @return True if array is sorted in ascending order; False, otherwise
     */
    public static boolean isSortedArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        boolean isSorted = true;

        if (arr.length == 1 || arr.length == 2) {
            isSorted = true;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }

    /**
     * Check if an array is already sorted in descending order.
     *
     * @param arr An array of integers
     * @return True if array is sorted in descending order; False, otherwise
     */
    public static boolean isSortedArrayDescending(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        boolean isSorted = true;

        if (arr.length == 1 || arr.length == 2) {
            isSorted = true;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }

    /**
     * Find max value in an array of integers.
     *
     * @param arr An array of integers
     * @return Max value
     */
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int maxVal = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > maxVal) {
                maxVal = i;
            }
        }

        return maxVal;
    }

    /**
     * Find min value in an array of integers.
     *
     * @param arr An array of integers
     * @return Min value
     */
    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int minVal = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < minVal) {
                minVal = i;
            }
        }

        return minVal;
    }

    public static void dump(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
