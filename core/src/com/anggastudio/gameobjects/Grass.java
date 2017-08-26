package com.anggastudio.gameobjects;

/**
 * Created by anggapratama_m on 8/24/17.
 */

public class Grass extends Scrollable {

    // When Grass's constructor is invoked, invoke the super (Scrollable) constructor
    public Grass(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
    }

    public void onRestart(float x, float scrollSpeed) {
        position.x = x;
        velocity.x = scrollSpeed;
    }

}
