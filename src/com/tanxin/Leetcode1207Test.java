package com.tanxin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode1207Test {
    int[] nums;
    Leetcode1207 lc  =  new Leetcode1207();
    @Before
    public void setUp() throws Exception {
        nums = new int[]{1,2,2,1,1,3};
    }

    @Test
    public void uniqueOccurrences() {

        boolean ans = lc.uniqueOccurrences(nums);
        assertEquals(true, ans);
    }
}