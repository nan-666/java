package 第六章.函数;

public class C201_06_03_输出100以内素数 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)){
                System.out.printf("%4d",i);
            }
        }
    }

    /**
     *
     * @param i
     * @return
     */
    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
