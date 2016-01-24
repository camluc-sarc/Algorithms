/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.algorithms.sort;

/**
 *
 * @author Cam
 */
public class BubbleSort implements SortAlgorithm {

    /**
     * Sort using bubble sort algorithm, ascending order.
     * Optimization 1: each loop will stop 1 position earlier than previous loop.
     * 
     * @param arr An array of integers
     * @return Sorted array
     */
    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        if (arr.length == 1) {
            return arr;
        }
        
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        
        return arr;
    }
    
}
