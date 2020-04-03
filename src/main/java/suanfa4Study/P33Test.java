package suanfa4Study;

import java.util.Scanner;

public class P33Test {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //T113();
        int sum = 0;
        for(int i =1;i<1000;i *=2){
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void T113(){
        try {
            System.out.println("请输入第一个整数：");
            int i = sc.nextInt();
            System.out.println("请输入第二个整数：");
            int j = sc.nextInt();
            System.out.println("请输入第三个整数：");
            int k = sc.nextInt();
            if( i==j&&j==k ){
                System.out.println("equal");
            }else {
                System.out.println("not equal");
            }
        }catch (Exception e){
            System.out.println("麻烦输入整数2");
        }

    }
}
