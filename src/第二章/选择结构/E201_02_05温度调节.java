package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_05温度调节 {
    public static void main(String[] args) {
        System.out.println("请输入温度:");
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();

        if(temperature>26){
            System.out.println("开启制冷");
        }else if(temperature<10){
            System.out.println("开启制热");
        }else{
            System.out.println("开启送风");
        }
    }
}
