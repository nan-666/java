package 第二章.选择结构;
import java.util.Scanner;
public class E201_02_09判断体型 {
    public static void main(String[] args) {
        System.out.println("请输入身高和体重");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();//身高
        int weight = scan.nextInt();//体重

        //计算BMI指数
        double BMI = weight/Math.pow(height*1.0/100,2);

        //体型描述
        int nubmer = (int)BMI/5;
        if(BMI<18.5){
            System.out.println("体重过低");
            return ;
        }
        switch(nubmer){
            case 3: ;
            case 4:
                System.out.println("正常");
                break;
            case 5:
                System.out.println("肥胖前期");
                break;
            case 6:
                System.out.println("Ⅰ度肥胖");
                break;
            case 7:
                System.out.println("Ⅱ度肥胖");
                break;
            default:
                System.out.println("Ⅲ度肥胖");
        }
    }
}
