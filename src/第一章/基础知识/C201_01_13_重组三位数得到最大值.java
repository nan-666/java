package 第一章.基础知识;
import java.util.Scanner;
public class C201_01_13_重组三位数得到最大值 {
    public static void main(String[] args) {

        int number, midnuber, i, j, k;//定义一个三位数,一个中间数,以及用来接收它个位,十位,百位的三个变量
        int min = 0,mid = 0,max = 0;//分别定义小中大;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        number = scan.nextInt();
        //将这个数的个位,十位,百位分别拆分下来
        i = number % 10;
        midnuber = number / 10;
        j = midnuber % 10;
        midnuber = midnuber / 10;
        k = midnuber;
        max = (i>(j>k?j:k))?i:(j>k?j:k);
        min = (i<(j>k?j:k))?i:(j<k?j:k);
        mid = i+j+k-max-min;

        midnuber = max*100+mid*10+min;
        System.out.println("组成最大的数为:"+midnuber);


    }
}
