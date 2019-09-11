package 第四章.循环结构;

import java.util.Scanner;

public class C201_04_12_输出矩形 {
    public static void main(String[] args) {
        System.out.println("输入要打印星号的行数");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("输入要打印星号的列数");
        int y = scan.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
}
