package 第二章.选择结构;

public class C201_04_06_计算GDP {
    public static void main(String[] args) {
        double americaGDP = 142562.75;//美国GDP
        double chinaGDP = 49089.82;//中国GDP
        double americaRate = 1.02;//美国增长速率
        double chinaRate = 1.08;//中国增长速率
        int year = 2009;//初始年份
        while (americaGDP>chinaGDP){
            americaGDP = americaGDP*americaRate;
            chinaGDP = chinaGDP*chinaRate;
            year++;
        }
        System.out.println("中国GDP超过美国的年份为"+year);
    }
}
