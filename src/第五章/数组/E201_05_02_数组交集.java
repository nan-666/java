package 第五章.数组;

import java.util.Scanner;

public class E201_05_02_数组交集 {
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

        //计算出两个数组中相同的值
        int []c = new int[80];
        int flag = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(a[i] == b[j]){
                    c[flag] = a[i];
                    flag++;
                }
            }
        }
        System.out.printf("两个集合的交集有:");
        for(int i = 0; i < flag; i++){
            System.out.printf("%4d",c[i]);
        }

    }
}
