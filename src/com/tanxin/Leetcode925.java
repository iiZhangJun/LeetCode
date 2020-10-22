package com.tanxin;

/**
 * 925. 长按键输入
 */
public class Leetcode925 {

    public boolean isLongPressedName(String name, String typed) {
        if (typed == null || typed.length()==0) return false;
        int i=0;
        int j=0;
        while (i<name.length() && j<typed.length()){
            char nc = name.charAt(i);
            char tc = typed.charAt(j);
            if (nc==tc){
                i++;
                j++;
            }else {
                if (j>0 && tc == typed.charAt(j-1)){
                    j++;
                }else {
                    return false;
                }
            }
        }
        if (i<name.length()){
            return false;
        }
        while (j<typed.length()){
            if (typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else {
                return false;
            }
        }
        return true;
    }
}
