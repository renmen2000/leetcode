package com.ren.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void sort(int[] arr){
        if(arr ==null || arr.length<1){
            System.out.println("no data to sort");
            return;
        }
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        //k记录的是每次循环时找到的最小值
        for(int i=0;i<arr.length;i++){
            int k=i;
            for(int j=k+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k = j;
                }
            }
            //i为已排序好的数组每次找到当前最小值后更新
            if(i!=k){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr ={2,9,5,6,7,8,10,4,1};
        //int[] arr =new int[1];
        SelectSort.sort(arr);
    }
}
