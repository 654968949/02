package entity.letcode;

import java.util.Arrays;

public class guibingpaixu {
    public static void main(String[] args) {
        /**
         * 我居然忽视了一个非常重要的问题，代码是一行一行执行的，一行执行完毕后才会去执行下一行！
         */
        int[] arr = new int[]{7,6,1,9,5,8,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    /**
     * 分
     */
    public static void sort(int[] arr,int left,int right,int[] temp) {
        if (left < right) { //递归终止条件
            int middle = (int)Math.floor((left+right)/2);//找到数据的中间
            sort(arr,left,middle,temp); //左排序
            sort(arr,middle+1,right,temp); //右排序
            merge(arr,left,middle,right,temp); //对数据进行排序
        }

    }

    /**
     * 治
     */
    public static void merge(int[] arr,int left,int middle,int right,int[] temp) {
        int i = left;   //左数组的头指针
        int j = middle+1; //右数组的头指针
        int t = 0; //临时头指针
        while (i<=middle && j<=right) {
            if (arr[i] <= arr[j]) {
                System.out.println("i是多少？："+i+" arr[i]:"+arr[i]);
                temp[t++] = arr[i++];

            }
            else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=middle) {
            temp[t++] = arr[i++];
        }
        while (j<=right) {
            temp[t++] = arr[j++];

        }
        t = 0;

        while (left<=right) {
            arr[left++] = temp[t++];
        }
    }
}
