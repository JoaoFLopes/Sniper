package org.academiadecodigo.sniperelite.gameobjects;

/**
 * Created by codecadet on 13/10/16.
 */
public interface Destroyable {

    void hit (int damage);

    boolean isDestroyed();

}
