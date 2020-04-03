package suanfa4Study;

public class sqrt {
    public static void main(String[] args) {
        double c = 121;
        System.out.println(sqrt(c));
    }

    private static double sqrt(double num){
        if( num < 0 ) return Double.NaN;
        double err = 1e-15;//1e-15：此处表示，1乘以10的-15次方
        double t = num;
        while (Math.abs(t - num/t) > err*t) //Math.abs()取绝对值
            t=(num/t +t)/2.0;
        return t;
    }
}
