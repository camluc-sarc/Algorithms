/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.algorithms.sort;

import net.camluc.algorithms.utils.SortUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cam
 */
public class BubbleSortTest {

    SortAlgorithm bubbleSort = new BubbleSort();

    public BubbleSortTest() {
    }

    @Test
    public void testSort() {
        System.out.println("bubble sort");
        int[] arr = SortUtils.createUnsortedArray(1000, 10000);
        SortUtils.dump(arr);
        int[] result = bubbleSort.sort(arr);
        SortUtils.dump(result);
        assertTrue(SortUtils.isSortedArray(result));
    }

}
