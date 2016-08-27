package com.example.jessexx.panic.Models;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Vehicle extends Asset {

    public Vehicle(String name, String description, int PictureId, float value, CATEGORY category) {
        super(name, description, PictureId, value, category);
    }

    public Vehicle(String name, int PictureId, float value, CATEGORY category) {
        super(name, PictureId, value, category);
    }

}
