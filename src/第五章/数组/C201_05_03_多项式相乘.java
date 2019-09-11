package 第五章.数组;

public class C201_05_03_多项式相乘 {
    public static void main(String[] args) {
        int []a = {4,6,3};
        int []b = {9,0,5};
        int []c = {0,0,0,0,0};
        int number = 0;
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                number = a[i]*b[j];
                flag =  i+j;
                c[flag] += number;
            }
        }
        for(int x:c){
            System.out.printf("%4d",x);
        }

    }
}
