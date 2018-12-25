package com.ren.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void sort(int[] arr){
        if(arr ==null || arr.length<1){
            System.out.println("no data to sort");
            return;
        }
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        for(int step=arr.length/2;step>0;step/=2){
            for(int i=step;i<arr.length;i++){
                int j=i;
                //理解不了可以类比InsertSort将step设置为1
                int temp =arr[j];
                if(arr[j]<arr[j-step]){ //小的向左交换
                    while(j-step>=0 && temp<arr[j-step]){
                        arr[j] = arr[j-step];
                        j-=step;
                    }
                    arr[j] =temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr ={2,9,5,6,7,8,10,4,1};
        ShellSort.sort(arr);
    }
}
