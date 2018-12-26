package com.ren.find;

/**
 * 从二维数组查找一个数字所在位置
 * 数组每一行都按从小到大排列
 * 每一列也按从小到大排列
 */
public class FindIntInArray {
    public static void findInt(int[][] tArr,int row,int column,int f){
        if(row==0 && column==0){
            System.out.println("arr is null");
        }
        if(row==0 || column==0){
            System.out.println("one arrag to find");
        }
        boolean isFind =false;
        if(row>0 && column>0 && tArr!=null){
            int i =0;
            int j=column-1;
            while (i <row & j>=0){
                int temp =tArr[i][j];
                if(temp==f){
                    System.out.println("find number in i="+i+",j="+j);
                    isFind =true;
                    break;
                }else if(f<temp){
                    --j;
                }else{
                    ++i;
                }
            }
            if(!isFind){
                System.out.println("the data not in the array");
            }

        }
    }

    public static void main(String[] args){
        int[][] tArr ={{1,2,4,8},{2,3,5,9},{4,5,7,11},{6,10,12,15}};
        FindIntInArray.findInt(tArr,4,4,1);
    }
}
