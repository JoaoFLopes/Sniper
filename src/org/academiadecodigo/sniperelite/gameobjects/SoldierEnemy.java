package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 12/10/16.
 */
public class SoldierEnemy extends Enemy {

    //Constructors

    public SoldierEnemy() {
    }

    public SoldierEnemy(int health, boolean isDead) {
        super(health, isDead);
    }

    //methods

    @Override
    public void hit(int damage) {

        int health = getHealth();

        System.out.println("I have " + health + " health");

        if(health <= 0){
            super.setDead(true);
            return;
        }
        else{
            health -= damage;
            super.setHealth(health);

        }
    }

    @Override
    public String getMessage() {
        return "Imma a Soldier, shoot me >:3";
    }


}
