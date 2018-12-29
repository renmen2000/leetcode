package com.ren.math;

public class Test {

    public static String LongestCommonPrefix(String[] str){
        String prefix = "";
        int min = str[0].length();

        for(int i=0; i<min; i++){
            for(int j=1; j<str.length; j++){
                if(str[0].charAt(i) != str[j].charAt(i)){
                    return prefix;
                }
                min = Math.min(min, str[j].length());
            }
            prefix += str[0].charAt(i);
        }
        return prefix;
    }

    public  static  void main(String[] args){
        String[] str ={ "aaabbc",null,"aaabde","ab"};
        System.out.println(Test.LongestCommonPrefix(str));
    }
}
