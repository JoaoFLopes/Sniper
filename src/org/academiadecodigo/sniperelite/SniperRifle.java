package org.academiadecodigo.sniperelite;
import org.academiadecodigo.sniperelite.gameobjects.*;

/**
 * Created by codecadet on 12/10/16.
 */
public class SniperRifle {

    private int bulletDamage;

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

    public void shoot(Enemy enemy){

        int number = RNG.getRandom(0,100);

        //receives an enemy and then shoots at him until he stops moving.

        if(number < 5) {
            System.out.println("Headshot! -------------");
            enemy.hit(this.bulletDamage * 2);
        }
        else if(number >= 5 && number < 15){
            System.out.println("Missed");
        }
        else{
            System.out.println("Took a shot");
            enemy.hit(this.bulletDamage);
        }

    }
}
