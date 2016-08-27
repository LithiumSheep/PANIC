package com.example.jessexx.panic.Models;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Bank extends Asset {

    public Bank(String name, String description, int PictureId, double value, CATEGORY category) {
        super(name, description, PictureId, value, category);
    }

    public Bank(String name, int PictureId, float value, CATEGORY category) {
        super(name, PictureId, value, category);
    }
}
