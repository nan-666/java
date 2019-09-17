package 第六章.函数;

import java.util.Scanner;

public class E201_06_08_验证四位卡布列克数 {
    public static void main(String[] args) {
        System.out.println("输入一个不是完全相同的四位数");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int N = 495;
        while (number!=6174){
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
        int b1000 = number/1000;
        int b100 = number/100%10;
        int b10 = number%100/10;
        int b = number%10;
        int []a = {b1000,b100,b10,b};
        for (int i = 0; i < a.length-1; i++) {

            for (int j = i+1; j < a.length; j++) {
                if(a[j]>a[i]){
                    int flag;
                    flag = a[i];
                    a[i] = a[j];
                    a[j] = flag;

                }

            }
        }
        int maxNum = a[0]*1000+a[1]*100+a[2]*10+a[3];
        int minNum = a[0]+a[1]*10+a[2]*100+a[3]*1000;
        int []result = {maxNum,minNum};
        return result;

    }
}
