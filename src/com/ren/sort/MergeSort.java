package com.ren.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
        public static int[] sort(int arr[]){
            if(arr ==null){
                return new int[0];
            }
            if(arr.length==1){
                return arr;
            }
            int mid = arr.length/2;
            int[] leftArr = Arrays.copyOfRange(arr,0,mid);  //左闭右开的区间
            int[] rightArr =Arrays.copyOfRange(arr,mid,arr.length);
            leftArr=sort(leftArr);
            rightArr=sort(rightArr);
            int[] merged = merge(leftArr,rightArr);
            return merged;
        }
        public static int[] merge(int[] leftArr,int[] rightArr){
                if(leftArr==null) leftArr = new int[0];
                if(rightArr == null) rightArr = new int[0];
                int[] merged = new int[leftArr.length+rightArr.length];
                int mi =0;
                int li =0;
                int ri =0;
                while (li<leftArr.length && ri<rightArr.length){
                    if(leftArr[li]<=rightArr[ri]){
                        merged[mi] = leftArr[li];
                        li++;
                    }else{
                        merged[mi] =rightArr[ri];
                        ri++;
                    }
                    mi++;
                }
                if(li<leftArr.length){ //leftArr中还有数据
                    for(;li<leftArr.length;li++){
                        merged[mi] = leftArr[li];
                        mi++;
                    }
                }
                if(ri<rightArr.length){ //rightArr中还有数据
                    for(;ri<rightArr.length;ri++){
                        merged[mi] =rightArr[ri];
                    }
                    mi++;
                }
                return merged;
        }

        public static void main(String[] args){
            int[] arr ={2,9,5,6,7,8,10,4,1};
            System.out.print(Arrays.toString(MergeSort.sort(arr)));
        }
}
