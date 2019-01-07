package com.ren.interview;


/**
 * 给定一个数组下标从0开始
 * 数组值在整形范围
 * 当数组中重复值大于数组长度的
 * 一半时输出任意一个该值的数组下标值
 * 不存在时输出-1
 *
 *  a[0] =1
 *  a[1]=3
 *  a[2]=-1
 *  a[3]=3
 *  a[4]=2
 *  a[5]=3
 *  a[6]=3
 *  输出5
 */
public class Interview1 {
    public static int numberCount(int[] arr){
        if(arr==null) return -1;
        int count=arr.length;
        int i=0;
        while(i<arr.length){
            if(i==0){
                count--;
            }else {
                if(arr[i]!=arr[i-1]){
                    count--;
                }
            }
            i++;
        }
        if(count<=arr.length/2) return -1;
        return 1;
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,-1,3,2,3,3,4,3,3};
        System.out.println(Interview1.numberCount(arr));
    }
}
