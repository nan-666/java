package 第四章.循环结构;

import java.util.Scanner;

public class E201_04_03_计算数列之和 {
    public static void main(String[] args) {
        System.out.println("请输入要计算的项数:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();//项数
        double sum = 0;//和
        double molecule = 1;//分子
        double denominator = 2;//分母

        for(int i =1;i<=number;i++){
            sum = sum+molecule/denominator;
            denominator = molecule+denominator;
        }
        System.out.println("前"+number+"的和为"+sum);
    }


}
