package com.test;


import org.junit.jupiter.api.Test;

public class test {
    public static void main(String[] args) {
        int[] oldArr = {1,2,3,4};
        oldArr = null;
        int[] newArr = copyArr(oldArr);
    }
    public static int[] copyArr(int[] intArr){
        if (intArr == null || intArr.length == 0) throw new RuntimeException("数组不能为空！");
        int[] newArr = new int[intArr.length];
        System.out.print("newArr：");
        for (int i = 0; i < intArr.length; i++) {
            newArr[i] = intArr[i];
            System.out.printf(newArr[i]+" ");
        }
        return newArr;
    }


    //获取unix时间戳
    @Test
    public void getCurrentUnixTimestamp(){
        String currentUnixTimestamp = Long.toString(System.currentTimeMillis());
        System.out.println(currentUnixTimestamp);
    }
}
