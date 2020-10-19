package com.tanxin;

//每日温度Ctrl+Shist+T 生成测试类
public class Leetcode739 {

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
