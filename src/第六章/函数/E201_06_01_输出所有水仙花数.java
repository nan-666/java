package 第六章.函数;

public class E201_06_01_输出所有水仙花数 {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            if(isnum(num)){
                System.out.printf("%d是水仙花数\n",num);
            }
        }
    }

    private static boolean isnum(int num) {
        int n,n10,n100;
        n100 = num/100;
        n10 = num/10%10;
        n = num%10;
        if(num == n100*n100*n100+n10*n10*n10+n*n*n){
            return true;
        }
        return false;
    }
}
