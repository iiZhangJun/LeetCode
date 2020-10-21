package com.tanxin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode11Test {

    int[] height;
    Leetcode11 lc = new Leetcode11();
    @Before
    public void setUp() throws Exception {
        height = new int[]{1,8,6,2,5,4,8,3,7};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxArea() {
        int area = lc.maxArea(height);
        assertEquals(49, area);
    }

    @Test
    public void maxArea2() {
        int area = lc.maxArea2(height);
        assertEquals(49, area);
    }
}