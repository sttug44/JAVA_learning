package CITYS;

public class redHeadquarters {

    static int lifeElement;

    public static void getM(int M) {
        lifeElement = M;
    }

    private final static CITYS.redHeadquarters RED = new redHeadquarters();

    private redHeadquarters() {
    }

    public static CITYS.redHeadquarters getInstance() {
        return RED;
    }


}
