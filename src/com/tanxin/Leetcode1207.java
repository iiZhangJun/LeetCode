package com.tanxin;

import java.util.*;

/**
 * 1207 独一无二的数
 */
public class Leetcode1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int value : arr)
        {
            map.put(value, map.getOrDefault(value,1) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer curr:map.values())
        {
            if (set.contains(map.get(curr)))
            {
                return false;
            }else
            {
                set.add(map.get(curr));
            }
        }
        return true;
    }
}
