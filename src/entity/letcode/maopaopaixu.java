package entity.letcode;

public class maopaopaixu {
    public static void main(String[] args) {
        int[] a = new int[]{10,522,2,3,56,25,14,21,89,57,103,101};
        maopao m = new maopao();
        int[] b = m.paixu(a);
        System.out.println("数组的长度："+b.length);
        for (int i = 0;i < b.length;i++) {
            System.out.println(b[i]);
        }
    }

    static class maopao {
        int[] paixu (int[] a) {
            for (int i = 0;i < a.length-1;i++) {
                boolean flag = true;
                for (int j = 0;j < a.length-i-1;j++) {
                    if (a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        flag = false;
                        }
                    }
                    if (flag == true) {
                        break;
                    }
                }
             return a;
            }


        }
    }


