package 第一章.基础知识;
import java.util.Scanner;

public class E201_01_05鬼谷算题 {
    public static void main(String[] args) {
        int number;//定义一个数,作为要验证鬼谷算题的数
        Scanner scan = new Scanner(System.in);
        System.out.println("输入要验证的数:");
        number = scan.nextInt();
        System.out.println("经过运算得到的数是:"+(number%3*70+number%5*21+number%7*15)%105);

    }
}
