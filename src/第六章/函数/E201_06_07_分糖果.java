package 第六章.函数;

public class E201_06_07_分糖果 {
    public static void main(String[] args) {
        int candy[] = {10,2,8,22,16,4,10,6,14,20};
        int flag=0;
        while (!isCame(candy)){
            allocate(candy);
            print(candy);
            flag++;
            System.out.printf("\n");

        }
        System.out.println("经过"+flag+"次糖果数相同");
    }

    private static void print(int[] candy) {
        for (int i = 0; i < candy.length; i++) {
            System.out.printf("%3d",candy[i]);
        }
    }

    private static void allocate(int[] candy) {

//        int m = candy[9];
//        if(m%2!=0){
//            m++;
//        }
//        for (int i = 0; i <candy.length ; i++) {
//
//            candy[(i+1)%10] = candy[(i+1)%10]+candy[i]/2;
//            candy[i] = candy[i]/2;
//            if(candy[i]%2!=0){
//                candy[i]++;
//            }
//        }
//        candy[0] = candy[0] +m/2;
        for (int i = 0; i < candy.length; i++) {
            if((candy[i]%2!=0)){
                candy[i]++;
            }
        }
        int tmp =candy[candy.length-1];
        for (int i = candy.length-1; i >0 ; i--) {
            candy[i] = candy[i]/2+candy[i-1]/2;
        }
        candy[0] =candy[0]/2+tmp/2;
    }

    private static boolean isCame(int[] candy) {
        boolean flag = true;
        for (int i = 0; i < candy.length; i++) {
            for (int j = 0; j < candy.length; j++) {
                if(candy[i]!=candy[j]){
                    flag = false;
                    return  flag;
                }
            }
        }
        return flag;
    }
}
