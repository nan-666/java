package 第八章.进制转换;

public class 进制转换器 {
    public static void main(String[] args) {
        /**
         * 总体思路
         * (1)显示操作菜单
         * (2)接收命令,根据命令来执行后续步骤
         * (3)接收输入
         * (4)转换
         * (5)输出结果
         * 重复以上过程,直达用户退出
         */
        showMenu();
        int []d = inputCommand();
        inputData(d[0]);

    }

    /**
     * 输入指定进制的数据
     * @param radix 指定进制
     * @return 合法的数据
     */
    private static String inputData(int radix) {
        return null;
    }

    /**
     * 接收命令
     * @return 进制转换信息,第一个元素表示原进制,第二个元素表示转换进制
     */
    private static int[] inputCommand() {
        return new int [0];
    }

    /**
     * 显示操作菜单
     */
    private static void showMenu() {
        System.out.println("1-");
    }
}
