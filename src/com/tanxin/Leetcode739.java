package com.tanxin;

import java.util.Stack;

//每日温度Ctrl+Shist+T 生成测试类
public class Leetcode739 {

    //nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
    public int[] dailyTemperatures2(int[] T) {
        int[] res = new int[T.length];
        if (T==null || T.length == 0) return res;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<T.length; i++){
            while (!stack.isEmpty() && T[stack.peek()]< T[i]){
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }


    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        if (T==null || T.length == 0) return res;
        for (int i=0;i<T.length-1; i++){
            for (int j=i+1;j < T.length; j++){
                if (T[j] > T[i]){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }





}
