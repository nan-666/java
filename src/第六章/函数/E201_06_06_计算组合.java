package 第六章.函数;

import java.util.Scanner;

public class E201_06_06_计算组合 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("输入n和m的值,必须m比n大:\n");
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.printf("C(%d,%d) = %f",n,m,C(n,m));
    }

    /**
     * 计算组合数值的函数
     * @param n
     * @param m
     * @return result 组合数的值
     */
    private static Object C(int n, int m) {
        double result = fact(m)/fact(n)/fact(m-n);
        return result;
    }

    /**
     * 阶乘函数
     * @param m
     * @return fact这个数的阶乘
     */
    private static int fact(int m) {
        if (m ==0){
            return 1;
        }
        return m*fact(m-1);
    }
}
