/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.algorithms.sort;

import java.util.Arrays;
import net.camluc.algorithms.utils.SortUtils;

/**
 * This implementation is based on
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html
 *
 * @author Cam
 */
public class BucketSort {

    /**
     * Sort array in ascending order, using bucket sort.
     *
     * @param arr An array of non-negative integers
     * @return Sorted array
     */
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int[] sortedArr = new int[arr.length];

        // if the max value in arr is 1000, this array's size is set to 1001
        int[] bucket = new int[SortUtils.max(arr) + 1];

        // the initial counts are set to 0
        Arrays.fill(bucket, 0);

        for (int i : arr) {
            bucket[i]++;
        }

        int curIndex = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                Arrays.fill(sortedArr, curIndex, curIndex + bucket[i], i);
                curIndex += bucket[i];
            }
        }

        return sortedArr;
    }
}
