package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_04按性别计算输血量 {
    public static void main(String[] args) {
        System.out.println("请分别输入性别和体重(kg):");
        Scanner scan =  new Scanner(System.in);
        String sex = scan.nextLine();
        int weight = scan.nextInt();

        if(sex.charAt(0)=='男'){
            System.out.println("输血量为:"+(weight>60?300:250));

        }else{
            System.out.println("输血量为:"+(weight>50?250:200));
        }

    }
}
