package CITYS;

public class blueHeadquarters {

    static int lifeElement;

    public static void getM(int M) {
        lifeElement = M;
    }

    private final static blueHeadquarters BLUE = new blueHeadquarters();

    private blueHeadquarters() {
    }

    public static blueHeadquarters getInstance() {
        return BLUE;
    }


}
