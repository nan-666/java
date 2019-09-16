package 第四章.循环结构;

import java.util.Scanner;

public class E201_04_06输出100以内的素数 {
    public static void main(String[] args) {
        System.out.println("请输入您要计算多少内的素数:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 2; i < number; i++) {
            int flag = 0;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    flag = 1;break;
                }
            }
            if(flag==0){
                System.out.printf("%4d",i);
            }
            isPrime(flag);
        }
    }

    private static void isPrime(int flag) {
    }


}
