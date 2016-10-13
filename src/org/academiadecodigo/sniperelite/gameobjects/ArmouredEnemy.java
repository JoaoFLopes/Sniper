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


        if (damage <= 0) {
            return;
        }

        if (health <= 0) {
            System.out.println("I'm dead!");
            this.setDead(true);
            return;
        }

        if (armor > 0) {
            System.out.println("I have " + armor + " armor and " + health + " health and took " + damage + " damage to my armor");
            dealDamageToArmor(damage);

            armor = getArmor();
            if (armor <= 0) {
                dealDamageToHealth(-armor);
                setArmor(0);
            }

        } else {
            System.out.println("I have " + armor + " armor and " + health + " health and took " + damage + " damage to my health");
            dealDamageToHealth(damage);
            if(getHealth() <= 0)
                this.setDead(true);
        }
    }

    public void dealDamageToHealth(int damage){
        health -= damage;
    }

    public void dealDamageToArmor(int damage){
        armor -= damage;
    }

    @Override
    public String getMessage() {
        return "Im a a armored enemy, shoot me >:3";
    }


}
