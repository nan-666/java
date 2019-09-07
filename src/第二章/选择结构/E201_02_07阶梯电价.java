package 第二章.选择结构;
        import java.util.Scanner;
public class E201_02_07阶梯电价 {
    public static void main(String[] args) {
        System.out.println("输入你使用的总电量");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double price1 = 0.4463,price2 = 0.4663,price3 = 0.5663;
        double total = 0;

        if(number<=150){
            total = number*price1;
        }else if(number>401){
            total = price1*150+price2*250+(number-400)*price3;
        }else{
            total = price1*150+(number-150)*price2;
        }
        System.out.println("您的总电费为"+total+"元");
    }
}
