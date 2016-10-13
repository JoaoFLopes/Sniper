package org.academiadecodigo.sniperelite;

import org.academiadecodigo.sniperelite.gameobjects.GameObject;

/**
 * Created by codecadet on 12/10/16.
 */
public class Main {

    public static void main(String[] args) {

        Game g = new Game();
        GameObject[] gameObjects = g.createObjects(5);

        SniperRifle sniperRifle = new SniperRifle(1);

        g = new Game(gameObjects, sniperRifle, 0);
        g.start();


    }
}
