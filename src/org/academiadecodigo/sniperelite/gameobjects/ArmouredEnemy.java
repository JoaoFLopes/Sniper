package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 12/10/16.
 */
public class ArmouredEnemy extends Enemy {

    int armor;

    //constructor

    public ArmouredEnemy(int armor) {
        this.armor = armor;
    }

    public ArmouredEnemy(int health, boolean isDead, int armor) {
        super(health, isDead);
        this.armor = armor;
    }

    //gets and sets


    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    //methods

    @Override
    public void hit(int damage) {

        int armor = getArmor();
        int health = getHealth();
        int remainingDamage;

        System.out.println("I have " + armor + " armor and " + health + " health");

        if(health <= 0){
            setDead(true);
            return;
        }

        if(armor > 0){
            setArmor(armor-damage);
        }
        else{
            setArmor(0);
            setHealth(health-damage);
        }
    }

    @Override
    public String getMessage() {
        return "Imma a armored, shoot me >:3";
    }


}
