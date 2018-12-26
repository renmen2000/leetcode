package com.ren.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class MaxNoRepeatSubString {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen =0;
        Map<String,Integer> tempMap = new HashMap<String,Integer>();
        int j =0;
        for(int i=0;i<s.length();i++){
            if(tempMap.containsKey(s.charAt(i)+"")){
                //j取当前重复字符在map中的位置与j原始的中较大的，以免j回退回去
                j = Math.max(tempMap.get(s.charAt(i)+""),j);
            }
            //取上次不重复字符串最大值与i-j+1取二者中大的
            maxLen = Math.max(maxLen,i-j+1);
            tempMap.put(s.charAt(i)+"",i+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        System.out.println(MaxNoRepeatSubString.lengthOfLongestSubstring("abcadeabacefegad"));
    }
}
