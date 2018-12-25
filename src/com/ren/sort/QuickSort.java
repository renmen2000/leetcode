package com.ren.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void sort(int[] arr,int left,int right){
        //初始时left等于0，right等于数组长度减1
        int i = left;
        int j= right;
        if(i>=j) return; //移动到数据重合时停止，代表一次排序结束
        int temp =arr[left];
        while(i!=j){
            while(i<j && arr[j]>=temp) j--; //向左移动j
            if(j>i) arr[i] =arr[j];  //此时右边的值小于左边，交换数据
            while (i<j && arr[i]<=temp) i++; //向右移动i
            if(i<j) arr[j] =arr[i]; //时右边的值小于左边，交换数据
        }
        arr[i] =temp; //中间值为temp需要设置回去，i左边为小于等于temp的值，右边为大于等于temp的值
        //递归排序左边的数据
        sort(arr,left,i-1);
        //递归排序右边的数据
        sort(arr,i+1,right);
    }
    public  static void main(String[] args){
        int[] arr ={2,9,5,6,7,8,10,4,1};
        QuickSort.sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
