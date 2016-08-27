package com.example.jessexx.panic.Models;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Other extends Asset {

    public Other(String name, String description, int PictureId, double value, CATEGORY category, ArrayList<Listing> listings) {
        super(name, description, PictureId, value, category, listings);
    }

    public Other(String name, int PictureId, float value, CATEGORY category, ArrayList<Listing> listings){
        super(name, PictureId, value, category, listings);
    }
}
