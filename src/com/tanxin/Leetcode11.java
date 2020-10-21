package com.tanxin;
//11.盛水最多的容器
public class Leetcode11 {

    public int maxArea(int[] height) {
        int area = 0;
        for (int i=1;i<height.length; i++){
            int high = height[i];
            for (int j=i-1;j>=0;j--){
                int width = i-j;
                area = Math.max(area,Math.min(high, height[j])*width);
            }
        }
        return area;
    }

    public int maxArea2(int[] height) {
        int area = 0;
        if ( height==null || height.length==0 ||height.length == 1) return area;
        int left =  0;
        int right = height.length - 1;
        while (left < right){
            area = Math.max(area, Math.min(height[right], height[left])*(right-left));
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

}
