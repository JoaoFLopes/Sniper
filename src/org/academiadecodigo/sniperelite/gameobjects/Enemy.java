package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 12/10/16.
 */
public abstract class Enemy extends GameObject implements Destroyable{

    int health;
    boolean dead;  //used by isDestroyed() instead of the isDead()

    //constructors

    public Enemy() {
    }

    public Enemy(int health, boolean isDead) {
        this.health = health;
        this.dead = isDead;
    }

    //gets and sets


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isDestroyed(){
        return dead;
    }

    //Methods

    public abstract void hit(int damage);

    @Override
    public abstract String getMessage();
}
