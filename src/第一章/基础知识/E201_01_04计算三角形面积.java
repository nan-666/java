package 第一章.基础知识;
import java.util.Scanner;
public class E201_01_04计算三角形面积 {
    public static void main(String[] args) {
        int a,b,c;//定义三角形的三条边长
        double s,area;//定义海伦变量s,面积area
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一条边的长度");
        a = scan.nextInt();
        System.out.println("请输入第二条边的长度");
        b = scan.nextInt();
        System.out.println("请输入第三条边的长度");
        c = scan.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
            s = (a+b+c)/2.0;//计算海伦变量的值
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));//计算面积
            System.out.println("三角形的面积Area="+area);//输出面积
        }else{
            System.out.println("无法构成三角形");

        }

    }
}

