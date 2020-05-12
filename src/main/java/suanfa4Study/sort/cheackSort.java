package suanfa4Study.sort;

/**
 * 选择排序：一种最简单的排序算法
 *  首先找到最小的元素，将他和数组第一个元素交换位置，（如果第一个元素就是最小的，那他就和自己交换位置）
 *  然后再剩下的其他元素找最小的元素，将他和第二个元素交换位置。以此类推。
 *  应为他总是选择出最小的元素，所以被称作选择排序
 */
public class cheackSort extends Example{
    public static void main(String[] args) {
        Integer [] a = {1,2,3,5,4,5,6,2,2};
        sort(a);
        show(a);
    }

    public static void sort(Comparable[] a){
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++)
                if( less(a[j],a[min]) ) min = j;
            each(a,i,min);
        }
    }

}
