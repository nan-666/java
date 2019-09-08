package 第四章.循环结构;

public class E201_04_01存钱翻倍 {
    public static void main(String[] args) {
        double money = 10000;
        int i=0;
        while (money<20000){
            money = money*1.03;
            i++;
        }
        System.out.println("需要"+i+"年才能到两万元");
    }
}
