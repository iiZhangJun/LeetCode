package com.tanxin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Leetcode15Test {
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
    Leetcode15 lc = new Leetcode15();
    @Before
    public void setUp() throws Exception {



    }


    @Test
    public void threeSum() {
        List<List<Integer>> ans = lc.threeSum(nums);
        for (List res:ans){
            for (Object it:res){
                System.out.println(it);
            }
        }

    }


}