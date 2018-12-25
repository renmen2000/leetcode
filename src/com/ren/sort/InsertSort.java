package com.ren.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void sort(int[] arr){
        if(arr ==null || arr.length<1){
            System.out.println("no data to sort");
            return;
        }
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            //j代表已排序的部分
            for(;j>=0;--j){
                if(arr[j] > temp){
                    //实际上是所有元素都向后移一位，因为j位是已排序好的数组
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            //最后将temp放入结束循环时的位置,因为循环时发生了--j所以此时要将数据放到j+1才对
            arr[j+1] =temp;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int[] arr ={2,9,5,6,7,8,10,4,1};
        //int[] arr =new int[1];
        InsertSort.sort(arr);
    }
}
