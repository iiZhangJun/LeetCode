package com.tanxin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Leetcode739Test {
    static int[] nums;
    Leetcode739 lc = new Leetcode739();
    @Before
    public void setUp() throws Exception {
        nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
    }

    @Test
    public void dailyTemperatures() {
        int[] res = lc.dailyTemperatures(nums);
        assertArrayEquals(res, new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }
}