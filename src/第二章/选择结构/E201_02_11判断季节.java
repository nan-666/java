package 第二章.选择结构;

import java.util.Scanner;

public class E201_02_11判断季节 {
    public static void main(String[] args) {
        System.out.println("请输入月份:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();//月份

        //计算季节
        int flag = month%12/3;
        switch(flag){
            case 0:System.out.println(month+"月份是冬季");break;
            case 1:System.out.println(month+"月份是春季");break;
            case 2:System.out.println(month+"月份是夏季");break;
            case 3:System.out.println(month+"月份是秋季");break;
            default:;
        }
    }
}
