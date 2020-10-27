package com.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15 三数之和
 * // 答案中不可以包含重复的三元组
 * nums = [-1, 0, 1, 2, -1, -4]
 *  // -1 -1  -1 0 1 2 -4
 */
public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            if (i==0 || nums[i]!=nums[i-1]){  //去重
                int target = -nums[i];
                int left = i+1;
                int right = nums.length - 1;
                while (left < right){
                    if (nums[left]+nums[right]==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        ans.add(temp);
                        left++;right--;
                        while (left<nums.length && nums[left]==nums[left-1]){       //去重
                            left++;
                        }
                        while (right>0 && nums[right]==nums[right+1]){   //去重
                            right--;
                        }
                    }else if (nums[left]+nums[right]<target){
                        left++;
                    }else if (nums[left]+nums[right]>target){
                        right--;
                    }
                }
            }
        }
        return ans;
    }
    //-4 -1 -1  -1 0 1 2 2
    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,1,1,2};
        Leetcode15 lc = new Leetcode15();
        List<List<Integer>> ans = lc.threeSum(nums);
        for (List res:ans){
            for (Object it:res){
                System.out.println(it);
            }
        }
    }

}
