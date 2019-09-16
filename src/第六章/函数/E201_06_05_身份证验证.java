package 第六章.函数;

import java.util.Scanner;



public class E201_06_05_身份证验证 {
    public static void main(String[] args) {
        System.out.println("请输入身份证号:");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        String testnum = "10X98765432";
        String date = "";
        if(test_(id,testnum)){
            date = id.substring(7,12);
            System.out.println("性别:"+(id.charAt(17)%2==0?'女':'男')+"生日:"+date);
        }
    }

    private static boolean test_(String id, String testnum) {
        
    }
}
