package 第六章.函数;

public class E201_06_02_输出1000的完数 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            if(isnum(num)){
                System.out.printf("%d是完数\n",num);
            }
        }
    }

    private static boolean isnum(int num) {
        int sum = 0;
        for (int i = 1; i <=num/2 ; i++) {
            if(num%i==0){
                sum +=i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
