package com.example.jessexx.panic.Models;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Bank extends Asset {

    public Bank(String name, String description, int PictureId, double value, CATEGORY category, ArrayList<Listing> listings) {
        super(name, description, PictureId, value, category, listings);
    }

    public Bank(String name, int PictureId, float value, CATEGORY category, ArrayList<Listing> listings) {
        this(name, "", PictureId, value, category, listings);
    }
}
