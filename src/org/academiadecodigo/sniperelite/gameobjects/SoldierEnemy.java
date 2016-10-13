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


        if(damage < 0)
            return;

        if(health <= 0){
            System.out.println("I'm dead!");
            setDead(true);
            return;
        }
        else{
            System.out.println("I have " + health + " health and took " + damage + " damage");
            health -= damage;
            setHealth(health);
            if(getHealth() <= 0)
                this.setDead(true);

        }
    }

    @Override
    public String getMessage() {
        return "Im a Soldier, shoot me >:3";
    }


}
