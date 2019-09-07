package 第二章.选择结构;

import java.util.Scanner;

public class E201_02_10奖金发放 {
    public static void main(String[] args) {
        System.out.println("请输入总利润(万元)");
        Scanner scan = new Scanner(System.in);
        int profit = scan.nextInt();//利润

        //计算奖金
        int flag = profit/10;
        double money = 0;
        switch(flag) {
            default: {
                money = (profit - 100) * 0.01;
                profit = 100;
            }
            case 9:
                ;
            case 8:
                ;
            case 7:
                ;
            case 6: {
                money = money + (profit - 60) * 0.015;
                profit = 60;
            }
            case 5:
                ;
            case 4: {
                money = money + (profit - 40) * 0.03;
                profit = 40;
            }
            case 3:
                ;
            case 2:{
                money = money + (profit - 20) * 0.05;
                profit = 20;
            }
            case 1: {
                money = money + (profit - 10) * 0.075;
                profit = 10;
            }
            case 0:{
                money = money + profit*0.1;
            }
            System.out.println("您可获得的奖金是:"+money+"万元");


        }
    }
}
