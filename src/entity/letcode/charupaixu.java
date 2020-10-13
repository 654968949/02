package entity.letcode;

import java.util.Arrays;

public class charupaixu {
    public static void main(String[] args) {
        int[] arr = new int[]{2,9,7,4,1,6,5,3};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];//当前要插入的值
            int j = i;
            /**
             *
             */
            while (j > 0 && temp < arr[j-1]) { //已排序的值与当前的j进行比较，已排序里比当前的j大的话，就赋给当前的j位置
                arr[j] = arr[j-1];
                j--;//接着比较已排序里的下一个
            }

            if (j != i) {
                arr[j] = temp; //插入待插入的值
            }
        }
        return arr;


    }
}
