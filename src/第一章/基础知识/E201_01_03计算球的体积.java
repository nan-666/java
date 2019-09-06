package 第一章.基础知识;

import java.util.Scanner;

public class E201_01_03计算球的体积 {

        public static void main(String[] args) {
            //定义球的半径为r,球的体积为v
            double r,v;
            float pi = 3.14f;//定义圆周率为pi,值为3.14
            Scanner scan = new Scanner(System.in);
            System.out.printf("请输入球半径R=");
            r = scan.nextInt();
            v=4/3.0*pi*r*r*r;
            System.out.println("球的体积V="+v);


        }

}
