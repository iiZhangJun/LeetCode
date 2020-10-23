package com.tanxin;

import java.util.*;

/**
 * 763.划分字母区间
 */
public class Leetcode763 {

    public List<Integer> partitionLabels(String s) {
        List<Integer> l = new ArrayList<>();
        if (s==null || s.length()==0) return l;
        Map<Character,Integer> map  = new HashMap<>();
        for (int i=0;i < s.length(); i++){
            map.put(s.charAt(i), i);
        }
        int start = 0;
        int end = map.get(s.charAt(0));
        int index = 0;
        while (index <= end){
            if (index == end){
                l.add(end-start+1);
                start = end+1;
                index++;
                if (start < s.length()){
                    end = map.get(s.charAt(index));
                }
            }else {
                end = Math.max(end, map.get(s.charAt(index)));
                index++;
            }
        }
        return l;
    }
}
