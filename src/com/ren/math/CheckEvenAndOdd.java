package com.ren.math;

/**
 * 两种方式判断数据奇偶性效率统计
 */
public class CheckEvenAndOdd {
    public static void main(String[] args){
        int evenCount=0;
        int oddCount=0;
        long begin1 = System.currentTimeMillis();
        //与1做按位与
        for(int i=0;i<100_000_000;i++){
            if((i&1)==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("totalTime1="+(System.currentTimeMillis()-begin1));
        System.out.println(evenCount+","+oddCount);
        evenCount=0;
        oddCount=0;
        long begin2 = System.currentTimeMillis();
        //取余操作
        for(int j=0;j<100_000_000;j++){
            if(j%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("totalTime1="+(System.currentTimeMillis()-begin2));
        System.out.println(evenCount+","+oddCount);
    }
}
