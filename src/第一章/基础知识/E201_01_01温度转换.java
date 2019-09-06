package 第一章.基础知识;
import java.util.Scanner;
public class E201_01_01温度转换 {

    public static void main(String[] args) {
    float C,F;//定义摄氏温度为C,华氏温度为F;
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入需要转化的华氏温度F=");
    F = scan.nextFloat();//接收键盘键入的数值
    C = 5*(F-32)/9;//运用公式计算对应的摄氏温度
    System.out.println("C="+C);//打印摄氏温度C


    }
}
