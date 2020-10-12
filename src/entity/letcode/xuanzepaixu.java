package entity.letcode;

public class xuanzepaixu {

    public static void main(String[] args) {
        int[] a = new int[]{10,522,2,3,56,25,14,21,89,57,103,101};
        xuanze m = new xuanze();
        int[] b = m.paixu(a);
        System.out.println("数组的长度："+b.length);
        for (int i = 0;i < b.length;i++) {
            System.out.println(b[i]);
        }
    }
    static class xuanze {
        int[] paixu (int[] a) {
            for (int i = 0;i < a.length-1;i++) {
                int min = i;
                for (int j = i+1;j < a.length;j++) {
                    if (a[j] < a[min]) {
                        min = j;
                    }
                }
                if (i != min) {
                    int temp = a[min];
                    a[min] = a[i] ;
                    a[i]  = temp;
                }
            }
            return a;
        }

    }
}

