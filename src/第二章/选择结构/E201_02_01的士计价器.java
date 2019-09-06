package 第二章.选择结构;
        import java.util.Scanner;
public class E201_02_01的士计价器 {
    public static void main(String[] args) {
        System.out.println("请输入你行驶的路程");
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();//行驶路程
        int limit = 2;//收费分界线
        int price = 7,price1=3;//设置单价
        int total = 0;//总价
        if (distance>limit){
            total = (distance-limit)*price1+price;
        }else{
            total=price;
        }
        System.out.println("您总共的费用为"+total);
    }
}
