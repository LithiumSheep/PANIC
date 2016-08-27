package com.example.jessexx.panic.Models;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Home extends Asset {

    private String location;

    public Home(String name, String description, int PictureId, double value, CATEGORY category, ArrayList<Listing> listings, String
        location) {
        super(name, description, PictureId, value, category, listings);
        this.location = location;
    }

    public Home(String name, int PictureId, float value, CATEGORY category, ArrayList<Listing> listings, String location) {
        super(name, PictureId, value, category, listings);
        this.location = location;

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
