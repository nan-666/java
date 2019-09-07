package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_08个税计算器 {
    public static void main(String[] args) {
        System.out.println("输入您的工资总数");
        Scanner scan = new Scanner(System.in);
        double wages = scan.nextInt();//输入工资总数
        double wagesTax = wages-700-3500;//计算全月应纳税所得额
        double tax = 0;//个人所得税

        //计算个人所得税
        if(wagesTax<0){
            tax = 0;
        }else if(wagesTax<=1500){
            tax = wagesTax*0.03;
        }else if(wagesTax<=4500){
            tax = wagesTax*0.1-105;
        }else if(wagesTax<=9000){
            tax = wagesTax*0.2-555;
        }else if(wagesTax<=35000){
            tax = wagesTax*0.25-1005;
        }else if(wagesTax<=55000){
            tax = wagesTax*0.3-2755;
        }else if(wagesTax<=80000){
            tax = wagesTax*0.35-5505;
        }else if(wagesTax>80000){
            tax = wagesTax*0.45-13505;
        }

        System.out.println("您应缴个人所得税为"+tax);
    }
}
