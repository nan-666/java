package 第七章.算法;

public class E201_07_09_阶梯问题 {
    public static void main(String[] args) {
        int steps = 5;
        int n = step(steps);
        System.out.println(n);
    }

    private static int step(int n) {
        if(n==1||n==2){
            return n;
        }
        else{
            return step(n-1)+step(n-2);
        }
    }
}
