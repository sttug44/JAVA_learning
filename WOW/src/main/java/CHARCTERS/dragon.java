package CHARCTERS;

import ITEM.ARROW;
import ITEM.BOMB;
import ITEM.SWORD;
import ITEM.Weapon;

public class dragon extends worrier {
    static int serialNumber;
    double morale;
    Weapon weapon;

    public dragon(int myLifeElement, int dragonMaxLife) {
        weapon = getWeapon(serialNumber);
        morale = getMorale(myLifeElement, dragonMaxLife);
    }

    private Weapon getWeapon(int serialNumber) {
        switch (serialNumber % 3) {
            case 0:
                SWORD sword = new SWORD();
                return sword;
            case 1:
                ARROW arrow = new ARROW();
                return arrow;
            default:
                BOMB bomb = new BOMB();
                return bomb;
        }
    }

    private double getMorale(int myLifeElement, int dragonMaxLife) {
        return (double) myLifeElement / dragonMaxLife;
    }

}
