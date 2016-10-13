package org.academiadecodigo.sniperelite;
import org.academiadecodigo.sniperelite.gameobjects.*;

/**
 * Created by codecadet on 12/10/16.
 */
public class SniperRifle {

    private int bulletDamage;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //constructors

    public SniperRifle() {
    }

    public SniperRifle(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    //gets and sets

    public int getBulletDamage() {
        return bulletDamage;
    }

    public void setBulletDamage(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    //Methods

    public void shoot(Destroyable target){

        int number = RNG.getRandom(0,100);

        //receives an enemy and then shoots at him until he stops moving.

        if(!target.isDestroyed()) {
            if (number < 5 && !(target instanceof Barrel)) {
                System.out.println(ANSI_RED + "----------------- Headshot! Double Damage -----------------" + ANSI_RESET);
                target.hit(this.bulletDamage * 2);
            } else if (number >= 5 && number < 15) {
                System.out.println(ANSI_RED + "Sniper: Missed" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Sniper: Took a shot" + ANSI_RESET);
                target.hit(this.bulletDamage);
            }
        }

    }
}
