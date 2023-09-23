import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
         * int a = s.nextInt();
         * System.out.println("第一个整数：" + a);
         * int b = s.nextInt();
         * System.out.println("第二个整数：" + b);
         */

        /*
         * float a = s.nextFloat();
         * System.out.println("读取的浮点数为" + a);
         */

        String a = s.nextLine();
        System.out.println("读取的字符串是：" + a);
    }
}