package com.tanxin;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode128Test {

    Leetcode128 lc = new Leetcode128();
    int[] nums = new int[]{2147483647,-2147483648};
    @Test
    public void longestConsecutive() {
        int ans = lc.longestConsecutive(nums);
        assertEquals(1, ans);
    }
}