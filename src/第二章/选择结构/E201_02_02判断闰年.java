package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_02判断闰年 {
    public static void main(String[] args) {
        System.out.println("请输入要判断的年份");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year%4!=0){
            System.out.println(year+"不是闰年");
        }else if(year%400==0){
            System.out.println(year+"是闰年");
        }else if(year%100==0){
            System.out.println(year+"不是闰年");
        }else {
            System.out.println(year+"是闰年");
        }
    }
}
