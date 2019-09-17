package 第六章.函数;

import java.util.Scanner;

public class C201_06_07验证三位卡布列克常数 {
    public static void main(String[] args) {
        System.out.println("输入一个不是完全相同的三位数");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int N = 495;
        while (number!=495){
            int []result = recombine(number);
            number = result[0] - result[1];
            System.out.printf("%3d-%3d=%3d\n",result[0],result[1],number);
        }
    }

    /**
     * 计算最大值和最小值
     * @param number
     * @return 一个包含最大值和最小值的数组
     */

    private static int[] recombine(int number) {
        int b100 = number/100;
        int b10 = number/10%10;
        int b = number%10;
        int max = Math.max(b100,Math.max(b10,b));
        int min = Math.min(b100,Math.min(b10,b));
        int mid = b100+b10+b-max-min;
        int maxNum = max*100+mid*10+min;
        int minNum = max*1+mid*10+min*100;
        int []result = {maxNum,minNum};
        return result;

    }
}
