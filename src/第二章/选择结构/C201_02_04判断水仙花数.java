package 第二章.选择结构;
import java.util.Scanner;
public class C201_02_04判断水仙花数 {
    public static void main(String[] args) {

        int number, midnuber, i, j, k;//定义一个三位数,一个中间数,以及用来接收它个位,十位,百位的三个变量
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        number = scan.nextInt();
        //将这个数的个位,十位,百位分别拆分下来
        i = number/100;

        j = number/10%10;

        k = number%10;
        midnuber =i*i*i+j*j*j+k*k*k;
//        if(number==midnuber) {
//            System.out.println(number+"是水仙花数");
//        }else {
//            System.out.println(number+"不是水仙花数");
//        }
        System.out.printf("%d%s水仙花数",number,number==midnuber?"是":"不是");




    }
}


