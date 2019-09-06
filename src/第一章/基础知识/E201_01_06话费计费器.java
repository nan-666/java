package 第一章.基础知识;
import java.util.Scanner;
public class E201_01_06话费计费器 {
    public static void main(String[] args) {
        double second;//定义通话时长,单位为秒
        int minute;//定义分钟
        double money;//总费用
        double price = 0.2;//通话时间每分钟的单价
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入通话时长,以秒为单位,second=");
        second = scan.nextInt();
        minute = (int) Math.ceil(second/60.0);//将minute进行进位取整
        money = price*minute;
        System.out.println("您本次通话的费用为:"+money);
    }
}
