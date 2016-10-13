package org.academiadecodigo.sniperelite;

import org.academiadecodigo.sniperelite.gameobjects.*;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by codecadet on 12/10/16.
 */
public class Game {

    GameObject[] gameObjects;
    SniperRifle sniperRifle;
    int shotsFired;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    //constructor

    public Game() {
    }

    public Game(int sniperDamage, int numberOfEnemies, int shotsFired) {
        this.gameObjects = createObjects(numberOfEnemies);
        this.sniperRifle = new SniperRifle(sniperDamage);
        this.shotsFired = shotsFired;
    }

    //gets and sets

    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public SniperRifle getSniperRifle() {
        return sniperRifle;
    }

    public void setSniperRifle(SniperRifle sniperRifle) {
        this.sniperRifle = sniperRifle;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public void setShotsFired(int shotsFired) {
        this.shotsFired = shotsFired;
    }


    //Methods
    public void start(){

        Destroyable target;
        int enemyNumber = 1;
        int currentShots = 0;

        for (GameObject obj: gameObjects) {

            System.out.println("\n" + ANSI_BLUE + "Gonna fight enemy number " + enemyNumber + ANSI_RESET);
            System.out.println(ANSI_GREEN + obj.getMessage() + ANSI_RESET);
            currentShots = 0;
            if(obj instanceof Destroyable){
                target = (Destroyable)obj;
                while(!target.isDestroyed()){
                    sniperRifle.shoot(target);
                    shotsFired++;
                    currentShots++;
                }
                System.out.println("It took " + currentShots + " shots to kill the enemy number " + enemyNumber);
            }

            enemyNumber++;
        }

        System.out.println("\n" + shotsFired + " shots were fired");

    }

    public GameObject[] createObjects(int amount){

        GameObject[] newObjects = new GameObject[amount];
        int number;

        for(int i = 0; i < amount; i++){

            number = RNG.getRandom(0,100);

            //create objects
            if(number < 15)
                newObjects[i] = new Tree();
            else if(number >= 16 && number <= 65){
                newObjects[i] = new Barrel();
            }
            else if(number >= 31 && number <= 65)
                newObjects[i] = new SoldierEnemy(3, false);
            else
                newObjects[i] = new ArmouredEnemy(3, false, 4);

        }

        return newObjects;
    }

}
