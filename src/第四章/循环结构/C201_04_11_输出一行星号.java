package 第四章.循环结构;

import java.util.Scanner;

public class C201_04_11_输出一行星号 {
    public static void main(String[] args) {
        System.out.println("请输入要显示星号的个数");
        Scanner scan = new Scanner(System.in);
        int nember = scan.nextInt();
        for (int i = 0; i < nember; i++) {
            System.out.printf("*");
        }
    }
}
