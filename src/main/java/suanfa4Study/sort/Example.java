package suanfa4Study.sort;

/**
 * 排序算法模板
 */
public class Example {
    public static void sort(Comparable[] a){

    }
    /*
    1:所有可以 “排序” 的类都实现了java.lang.Comparable接口，Comparable接口中只有一个方法。
    2:public int compareTo(Object obj) ;
        该方法：
        返回 0 表示 this == obj
        返回整数表示 this > obj
        返回负数表示 this < obj
    3:实现了 Comparable 接口的类通过实现 comparaTo 方法从而确定该类对象的排序方式。
     */
    protected static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    protected static void each(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++)
            if( less(a[i],a[i-1]) )
                return false;
            return true;
    }

}
