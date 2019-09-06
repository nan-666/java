package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_06购买火车票 {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄和身高:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int high = scan.nextInt();
        int price1 = 100,price2 = 190;
        System.out.println("请输入你需要购买的票种"+'\n'+"1.坐票 2.卧铺");
        int keed = scan.nextInt();

        if(age>=18){
            System.out.println("您的票价是:"+(keed==1?price1:price2)+"元");
        }else{
            if(keed==1){
                if(high<120){
                    System.out.println("您的票价是:0元");
                }else if(high>150){
                    System.out.println("您的票价是:100元");
                }else{
                    System.out.println("您的票价是:"+price1/2+"元");
                }
            }else{
                System.out.println("您的票价是:"+(price2-price1/2)+"元");
            }
        }

    }
}
