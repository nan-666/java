package 第五章.数组;

import java.util.Scanner;

public class E201_05_06_矩阵转置 {
    public static void main(String[] args) {
        System.out.println("请输入矩阵的行数");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.println("请输入矩阵的列数");
        int colunm = scan.nextInt();
        int [][]a = new int[row][colunm];
        System.out.println("请输入矩阵的元素");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <colunm ; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int j = 0; j <colunm ; j++) {
            for (int i = 0; i < row; i++) {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
