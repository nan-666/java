package 第五章.数组;

import java.util.Scanner;

public class E201_05_07_杨辉三角 {
    public static void main(String[] args) {
        System.out.println("输入二维数组的行数");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//行数
        int [][]a = new int[n][n];
        
        //计算杨辉三角
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0){
                    a[i][j] = 1;
                }
                if(i==j){
                    a[i][j] = 1;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = a[i-1][j] + a[i-1][j-1];
            }
        }
        //输出杨辉三角
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
