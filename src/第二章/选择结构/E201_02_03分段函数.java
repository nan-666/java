package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_03分段函数 {
    public static void main(String[] args) {
        System.out.println("请输入X的值:");
        Scanner scan =  new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;//给y一个初始值

        if(x<0){
            y = x+6;
        }else{
            y = x*x-4*x+6;
        }
        System.out.printf("f(%d)=%d",x,y);
    }
}
