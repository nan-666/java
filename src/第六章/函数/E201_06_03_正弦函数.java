package 第六章.函数;

import java.util.Scanner;


public class E201_06_03_正弦函数 {
    public static void main(String[] args) {
        System.out.println("请输入x的值:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.printf("%f",sin_(x));
    }

    private static Object sin_(double x) {
        double h=x,s=1;//定义h为分子,s为分母;
        int flag =-1;
        double sum = x;
        int k = 3;//记录阶乘的底数
        while (Math.abs(flag*h/s)>1e-6){
            h = h*x*x;
            s = 1;
            for (int i = 1; i <= k; i++) {
                s = s*i;
            }

            k = k+2;
            sum =sum+flag*h/s;
            flag = 0-flag;
        }
        return sum;
    }
}
