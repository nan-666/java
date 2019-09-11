package 第五章.数组;

import java.util.Scanner;

public class C201_05_01_计算方差 {
    public static void main(String[] args) {
        System.out.println("请输入人数和分数");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []x = new int[n];
        int sum = 0;

        for (int i = 0; i <n ; i++) {
            x[i] = scan.nextInt();
            sum +=x[i];
        }
        double ave = sum*1.0/n;
        sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i]-ave,2);
        }
        double result = Math.sqrt(sum);
        System.out.println(result);

    }
}
