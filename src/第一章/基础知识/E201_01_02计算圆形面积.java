package 第一章.基础知识;

import java.util.Scanner;

public class E201_01_02计算圆形面积 {

    public static void main(String[] args) {
        //定义半径为r,pi为圆周率3.14,S为圆形的面积
        int r;
        float pi = 3.14f;
        float S ;
        Scanner scan = new Scanner(System.in);
        System.out.printf("请输入圆形半径R=");
        r = scan.nextInt();
        S = r*r*pi;
        System.out.println("圆形面积S="+S);


    }
}
