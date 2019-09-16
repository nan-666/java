package 第六章.函数;

import java.util.Scanner;

public class E201_06_04_计算常量e {
    public static void main(String[] args) {
        System.out.println("请输入N的值:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double e = 1;
        for (int i = 1; i <= n; i++) {
            e = e+fact(i);
        }
        System.out.println("e="+e);
    }

    private static double fact(int n) {
        long h = 1,s = 1;//定义分子和分母
        for (int i = 1; i <=n ; i++) {
            s = s*i;
        }
        double number = h*1.0/s;
        return number;
    }
}
