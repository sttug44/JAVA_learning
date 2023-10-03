package WOW;


import CITYS.blueHeadquarters;
import CITYS.redHeadquarters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testTime = s.nextInt();
        for (int i = 0; i < testTime; i++) {
            int M = s.nextInt(); //每个司令部一开始都有M个生命元( 1 <= M <= 10000)
            int N = s.nextInt(); //两个司令部之间一共有N个城市( 1 <= N <= 20 )
            int R = s.nextInt(); //arrow的攻击力是R
            int K = s.nextInt(); //lion每经过一场未能杀死敌人的战斗，忠诚度就降低K。
            int T = s.nextInt(); //要求输出从0时0分开始，到时间T为止(包括T) 的所有事件。T以分钟为单位，0 <= T <= 5000

            int dragonMaxLife = s.nextInt();
            int ninjaMaxLife = s.nextInt();
            int icemanMaxLife = s.nextInt();
            int lionMaxLife = s.nextInt();
            int wolfMaxLife = s.nextInt();

            int dragonAttackValue = s.nextInt();
            int ninjaAttackValue = s.nextInt();
            int icemanAttackValue = s.nextInt();
            int lionAttackValue = s.nextInt();
            int wolfAttackValue = s.nextInt();

            System.out.println("Case"+(i+1)+":");

            redHeadquarters RED = redHeadquarters.getInstance();
            redHeadquarters.getM(M);
            blueHeadquarters BLUE = blueHeadquarters.getInstance();
            blueHeadquarters.getM(M);

        }

    }

}