package com.tanxin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode925Test {

    String[] names;
    String[] types;
    boolean[] ans;
    Leetcode925 lc = new Leetcode925();
    @Before
    public void setUp() throws Exception {
        names = new String[]{"alex", "saeed", "leelee","laiden","alex","vtkgn"};
        types = new String[]{"aaleex", "ssaaedd", "lleeelee","laiden","alexxr","vttkgnn"};
        ans = new boolean[]{true, false, true, true,false,true};
    }

    @Test
    public void isLongPressedName() {
        for (int i=0;i<names.length; i++){
            boolean res  =  lc.isLongPressedName(names[i],types[i]);
            assertEquals(ans[i],res);
        }
    }
}