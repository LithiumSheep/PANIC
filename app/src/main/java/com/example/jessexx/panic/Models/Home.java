package com.example.jessexx.panic.Models;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Home extends Asset {

    private String location;

    public Home(String name, String description, int PictureId, float value, CATEGORY category) {
        super(name, description, PictureId, value, category);
    }

    public Home(String name, int PictureId, float value, CATEGORY category) {
        super(name, PictureId, value, category);
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
