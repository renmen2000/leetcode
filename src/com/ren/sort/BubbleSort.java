package com.ren.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] arr){
        if(arr ==null || arr.length<1){
            System.out.println("no data to sort");
            return;
        }
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        for(int i=0;i<arr.length;i++){
            boolean isChange =false;
            //因为要取arr[j+1]所以循环到arr.length-2即可
            for(int j=0;j<arr.length-i-1;j++){
                //大的向后冒泡
                if(arr[j]>arr[j+1]){
                   int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;
                    isChange =true;
                }
            }
            //不发生交换的情况下立即退出循环完成排序
            if(!isChange) break;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int[] arr ={2,9,5,6,7,8,10,4,1};
        //int[] arr =new int[1];
        BubbleSort.sort(arr);
    }
}
