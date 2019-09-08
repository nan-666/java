package 第四章.循环结构;

import java.util.Random;

public class E201_04_02统计法计算圆周率 {
    public static void main(String[] args) {


        int i = 0;
        int flag = 0;
        double pi = 0.0;

        while(i<100000000){
            double x = Math.random();
            double y = Math.random();
            double l = Math.sqrt(x*x+y*y);
            if(l<=1){
                flag++;
            }
            i++;
        }
        pi = flag*1.0/i*4;
        System.out.println(pi);
    }


}
