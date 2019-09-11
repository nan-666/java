package 第五章.数组;

import java.util.Scanner;

public class E201_05_04_超大数相加 {
    public static void main(String[] args) {
        System.out.printf("请输入第一个数组的长度和元素");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int []a = new int[n1];
        for (int i = 0; i <n1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.printf("请输入第二个数组的长度和元素");
        int n2 = scan.nextInt();
        int []b = new int[n2];
        for (int i = 0; i <n2; i++) {
            b[i] = scan.nextInt();
        }

        //定义第三个数组
        int []c = new int[30];
        int carry = 0;
        int flag = 0;
        for (int i = 0; i < (n1<n2?n1:n2); i++) {
            c[i] = (a[i]+b[i]+carry)%10;
            carry = (a[i]+b[i]+carry)/10;
            flag++;
        }
        for (int i=(n1<n2?n1:n2); i < (n1>n2?n1:n2); i++) {
            if (n1>n2){
                c[i] = (a[i]+carry)%10;
                flag++;
                carry = (a[i]+carry)/10;
                if(i==(n1>n2?n1:n2)-1&&carry==1){
                    c[i+1] = carry;
                    flag++;
                }
            }
            else {
                c[i] = (b[i]+carry)%10;
                carry = (b[i]+carry)/10;
                flag++;
                if(i==(n1>n2?n1:n2)-1&&carry==1){
                    c[i+1] = carry;
                    flag++;
                }
            }
        }
        for(int x=0;x<flag;x++){
            System.out.printf("%d",c[x]);
        }

    }
}
