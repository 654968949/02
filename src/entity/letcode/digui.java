package entity.letcode;


public class digui {
    public static void main(String[] args) {
        diguiPractice di = new diguiPractice();
        System.out.println(di.add(5));
    }

    /**
     * 递归求n到1的和
     */
    static class diguiPractice {
        Integer add(int n) {
            if (n == 1) {
                return 1;
            }
            return add(n-1) + n;
        }
    }
}
