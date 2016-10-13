package org.academiadecodigo.sniperelite.gameobjects;

import org.academiadecodigo.sniperelite.RNG;

/**
 * Created by codecadet on 13/10/16.
 */
public class Barrel extends GameObject implements Destroyable{


    BarrelType barrelType;
    int currentDamage;
    boolean destroyed;

    public Barrel(){
        this.barrelType = getRandomType();
    }

    @Override
    public void hit(int damage) {

        if(damage < 0)
            return;

        if(currentDamage >= barrelType.getMaxDamage()) {
            System.out.println("I was destroyed");
            destroyBarrel();
        }
        else {
            dealDamage(damage);
            System.out.println("I have received " + currentDamage + " damage");
        }

    }

    public void destroyBarrel(){
        this.destroyed = true;
    }

    public void dealDamage(int damage){
        currentDamage += damage;
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String getMessage(){
        return "I'm a barrel of the " + barrelType + " type and I have a Damage Threshold of " + barrelType.getMaxDamage();
    }

    public BarrelType getRandomType(){

        return BarrelType.values()[RNG.getRandom(0,3)];
    }
}
