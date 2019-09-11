package 第五章.数组;

import java.util.Scanner;

public class E201_05_01_成绩统计 {
    public static void main(String[] args) {
        System.out.printf("输入学生个数\n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//学生人数
        int []grade = new int[n];
        System.out.println("输入学生的分数");
        for(int i=0;i<n;i++){
            grade[i] = scan.nextInt();
        }

        //计算最高分
        int MAX = 0;
        int MAX_index = 0;
        for (int i = 0; i <n; i++) {
            if(grade[i]>MAX){
                MAX = grade[i];
                MAX_index = i;
            }
        }

        //计算最小值
        int MIN = 100;
        int MIN_index = 0;
        for (int i = 0; i <n; i++) {
            if(grade[i]<MIN){
                MIN = grade[i];
                MIN_index = i;
            }
        }

        //计算平均分
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += grade[i];
        }
        double ave = sum*1.0/n;

        //计算标准差
        sum = 0;
        for(int i=0;i<n;i++){
            sum +=Math.pow(grade[i]-ave,2);
        }
        double SD = Math.sqrt(sum*1.0/n);
        System.out.printf("最大值:%4d最小值:%4d平均数:%4f标准差:%4f",MAX,MIN,ave,SD);
    }
}
