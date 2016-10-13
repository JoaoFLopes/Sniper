package org.academiadecodigo.sniperelite;

import org.academiadecodigo.sniperelite.gameobjects.*;

/**
 * Created by codecadet on 12/10/16.
 */
public class Game {

    GameObject[] gameObjects;
    SniperRifle sniperRifle;
    int shotsFired;

    //constructor

    public Game() {
    }

    public Game(GameObject[] gameObjects, SniperRifle sniperRifle, int shotsFired) {
        this.gameObjects = gameObjects;
        this.sniperRifle = sniperRifle;
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

        Enemy target;
        int auxCount = 1;

        for (GameObject obj: gameObjects) {

            System.out.println("Gonna fight enemy number " + auxCount);
            if(obj instanceof Tree) {
                System.out.println(obj.getMessage());
                auxCount++;
                continue;
            }
            else
                target = (Enemy)obj;
            System.out.println(obj.getMessage());
            while(!target.isDead()){
                sniperRifle.shoot(target);
                shotsFired++;
            }
            auxCount++;
        }

        System.out.println(shotsFired + " shots were fired");

    }

    public GameObject[] createObjects(int amount){

        GameObject[] newObjects = new GameObject[amount];
        int number;

        for(int i = 0; i < amount; i++){

            number = RNG.getRandom(0,100);

            //create objects
            if(number < 15)
                newObjects[i] = new Tree();
            else if(number >= 16 && number <= 65)
                newObjects[i] = new SoldierEnemy(3, false);
            else
                newObjects[i] = new ArmouredEnemy(3, false, 4);

        }

        return newObjects;
    }

}
