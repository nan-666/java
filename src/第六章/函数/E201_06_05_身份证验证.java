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
            date = id.substring(6,14);
            System.out.println("性别:"+(id.charAt(16)%2==0?'女':'男')+"\n生日:"+date);
        }
        else{
            System.out.println("身份证不合法");
        }
    }

    private static boolean test_(String id, String testnum) {
        int sum = (id.charAt(0)-48)*7+(id.charAt(1)-48)*9+(id.charAt(2)-48)*10+(id.charAt(3)-48)*5+(id.charAt(4)-48)*8+(id.charAt(5)-48)*4+(id.charAt(6)-48)*2+(id.charAt(7)-48)*1+(id.charAt(8)-48)*6+(id.charAt(9)-48)*3+(id.charAt(10)-48)*7+(id.charAt(11)-48)*9+(id.charAt(12)-48)*10+(id.charAt(13)-48)*5+(id.charAt(14)-48)*8+(id.charAt(15)-48)*4+(id.charAt(16)-48)*2;
        int num = sum%11;
        if(id.charAt(17)==testnum.charAt(num)){
            return true;
        }
        return false;
    }
}
