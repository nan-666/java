package 第四章.循环结构;

import java.util.Scanner;

public class E201_04_08_输出1000以内的完数 {
    public static void main(String[] args) {
        System.out.println("输入您需要查找完数的最大值");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        for(int i=1;i<=number;i++){
            int sum = 0;
            for (int j = 1; j <i ; j++) {
                if(i%j==0){
                    sum = sum + j;
                }
            }
            if(i==sum){
                System.out.printf("%4d",i);
            }
        }

    }
}
