package 第二章.选择结构;

import java.util.Scanner;

public class E201_02_12四则运算器 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个操作数");
        double number1 = scan.nextDouble();
        System.out.println("请输入一个操作符");
        String oper = scan.next();//操作符
        System.out.println("请输入第二个操作数");
        double number2 = scan.nextDouble();
        double sum = 0;

        switch (oper.charAt(0)){
            case '/':if(number2==0.0){
                System.out.println("除数不能为0");
                return;
            }else {
                sum = number1/number2;
            }break;
            case '*':sum = number1*number2;break;
            case '+':sum = number1+number2;break;
            case '-':sum = number1-number2;break;
            default:
                System.out.println("输入的操作符非法!");
                return;
        }
        System.out.println(number1+oper+number2+"="+sum);
    }
}
