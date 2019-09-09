package 第四章.循环结构;

public class E201_04_04_输出所有水仙花数 {
    public static void main(String[] args) {
        for(int x = 100;x<1000;x++){
            int i = x/100;

            int j = x/10%10;

            int k = x%10;
            int midnuber = i*i*i+j*j*j+k*k*k;
            if(x == midnuber){
                System.out.println(x+"是水仙花数");
            }
        }
    }
}
