package 第四章.循环结构;

import java.util.Scanner;

public class E201_04_05验证角谷定理 {
    public static void main(String[] args) {
        System.out.println("请输入一个自然数");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number!=1){
            if(number%2==0){
                number /=2;
                System.out.println(number+"="+number*2+"/"+"2");
            }else{
                number = number*3+1;
                System.out.println(number+"="+(number-1)/3+"*3+1");
            }
        }
    }
}
