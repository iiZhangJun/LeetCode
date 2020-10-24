package com.tanxin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 128 最长连续序列
 */
public class Leetcode128 {

    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Long> set = new HashSet<>();
        for (int i=0;i<nums.length; i++){
            set.add((long) nums[i]);
        }
        int length = 0;
        Iterator<Long> it = set.iterator();
        while (it.hasNext()){
            long curr = it.next();
            if (!set.contains(curr-1)){
                length++;
                while (set.contains(++curr)){
                    length++;
                }
                ans = Math.max(ans,length);
                length = 0;
            }
        }
        return ans;
    }


    public int longestConsecutive2(int[] nums) {
        if (nums==null || nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 1;
        int ans = 0;
        Arrays.sort(nums);
        int length = 1;
        int i= 1;
        for (;i<nums.length;i++){
            if (nums[i] == nums[i-1]+1){
                length++;
            }else if (nums[i] != nums[i-1]+1 && nums[i] != nums[i-1]){
                ans = Math.max(length,ans);
                length = 1;
            }
        }
        return Math.max(ans, length);
    }






}
