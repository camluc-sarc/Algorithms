/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.algorithms.generator;

import net.camluc.algorithms.utils.SortUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cam
 */
public class SortUtilsTest {

    public SortUtilsTest() {
    }

    @Test
    public void testCreateUnsortedArray() {
        System.out.println("createUnsortedArray");
        int arrSize = 100;
        int[] result = SortUtils.createUnsortedArray(arrSize, 1000);
        assertEquals(arrSize, result.length);
    }

    @Test
    public void testIsSortedArray() {
        System.out.println("isSortedArray");
        int[] arr = {22, 33, 55, 66, 88};
        assertTrue(SortUtils.isSortedArray(arr));
    }

    @Test
    public void testIsSortedArrayDescending() {
        System.out.println("isSortedArrayDescending");
        int[] arr = {99, 88, 77, 44, 33};
        assertTrue(SortUtils.isSortedArrayDescending(arr));
    }

    @Test
    public void testMax() {
        System.out.println("max");
        int[] arr = {22, 33, 77, 44, 11};
        assertEquals(SortUtils.max(arr), 77);
    }
}
