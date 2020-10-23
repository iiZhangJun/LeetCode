package com.tanxin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Leetcode763Test {

    String s;
    Leetcode763 lc =new Leetcode763();

    @Before
    public void setUp() throws Exception {
        s="ababcbacadefegdehijhklij";
    }

    @Test
    public void partitionLabels() {
        List<Integer> res  = lc.partitionLabels(s);
        List<Integer> ans = new ArrayList<>();
        ans.add(9);
        ans.add(7);
        ans.add(8);
        assertEquals(res,ans);
    }
}