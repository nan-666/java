package 第一章.基础知识;

import java.util.Scanner;
public class C201_01_12_计算三位数各位之和 {
    public static void main(String[] args) {
        int number,midnuber,i,j,k;//定义一个三位数,一个中间数,以及用来接收它个位,十位,百位的三个变量
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        number = scan.nextInt();
        //将这个数的个位,十位,百位分别拆分下来
        i = number%10;
        midnuber = number/10;
        j = midnuber%10;
        midnuber= midnuber/10;
        k = midnuber;
        number = i+j+k;
        System.out.printf("%d+%d+%d=%d",k,j,i,number);

    }
}
