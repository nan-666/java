package 第四章.循环结构;

import java.util.Scanner;

public class C201_04_15_输出菱形 {
    public static void main(String[] args) {
        System.out.printf("请输入行数");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int row = 1; row <= rows*2-1; row++) {
            int stars = 2*rows -1-2*Math.abs(rows-row);
            for (int col = 1; col <= Math.abs(rows-row); col++) {
                System.out.printf(" ");
            }
            for (int col = 1; col <= stars; col++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
