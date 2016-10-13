package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 13/10/16.
 */
public enum BarrelType {

    PLASTIC (4),
    WOOD (7),
    METAL (10);


    int maxDamage;

    BarrelType(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
