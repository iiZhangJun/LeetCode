package com.tanxin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode560Test {
    int[] nums;
    int k;
    Leetcode560 lc = new Leetcode560();

    @Before
    public void setUp() throws Exception {
        nums = new int[]{1,1,1};
        k=2;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subarraySum() {
        int ans = lc.subarraySum(nums,k);
        assertEquals(2, ans);
    }

    @Test
    public void subarraySum2() {
        int ans = lc.subarraySum2(nums,k);
        assertEquals(2, ans);
    }
}