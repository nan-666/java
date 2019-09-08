package 第四章.循环结构;

public class E201_04_07九九乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf("%4d*%d=%d",i,j,i*j);
                if(i==j){
                    System.out.printf("\n");
                }
            }
        }
    }
}
