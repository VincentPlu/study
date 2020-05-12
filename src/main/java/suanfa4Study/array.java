package suanfa4Study;


public class array {
    public static void main(String[] args) {
        int [] a = new int[]{55,22,33,44,11,66,88,99,77,1};
        int max = findMax(a);
        System.out.println("数组最大值："+max);
        int b[] = copyArrays(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        int c [] = reversalArrays(a);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        jzchengfa();
    }

    /**
     *  数组最大最小值
     * @param a
     * @return
     */
    private static int findMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if( a[i] > max ){
                max = a[i];
            }
        }
        return max;
    }

    /**
     * 复制数组
     * @param a
     * @return
     */
    private static int[] copyArrays(int[] a){
        int length = a.length;
        int [] b = new int[length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    /**
     * 数组倒置
     * @param a
     * @return
     */
    private static int[] reversalArrays(int [] a){
        int l = a.length;
        for (int i = 0; i < l/2; i++) {
            int temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        return a;
    }

    /**
     * 矩阵乘法
     */
    private static void jzchengfa(){
        int [][] a = new int[][]{{1,2},{3,4}};
        int [][] b = new int[][]{{5,6},{7,8}};
        int [][] c = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < b.length; i1++) {
                c[i][i1] = a[i][i1] * b[i][i1];
                System.out.print(c[i][i1]);
                System.out.print("||");
            }
            System.out.println();
        }
    }
}
