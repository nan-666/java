package 第五章.数组;

import java.util.Scanner;

public class E201_05_04_超大数相加 {
    public static void main(String[] args) {
        System.out.printf("请输入第一个数组的长度和元素");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int []a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.printf("请输入第二个数组的长度和元素");
        int n2 = scan.nextInt();
        int []b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = scan.nextInt();
        }
    }
}
