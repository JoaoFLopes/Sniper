package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 12/10/16.
 */
public abstract class Enemy extends GameObject {

    int health;
    boolean isDead;

    //constructors

    public Enemy() {
    }

    public Enemy(int health, boolean isDead) {
        this.health = health;
        this.isDead = isDead;
    }

    //gets and sets


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    //Methods

    public abstract void hit(int damage);

    @Override
    public abstract String getMessage();
}
