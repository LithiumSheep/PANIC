package com.example.jessexx.panic.Models;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Vehicle extends Asset {

    public enum CONDITION{
        LIKE_NEW, SLIGHTLY_USED, USED, DAMAGED;
    }
    private int year;

    private String location;

    private CONDITION condition;

    public Vehicle(String name, String description, int PictureId, double value, CATEGORY category, ArrayList<Listing> listings, int
        year, String location, CONDITION condition) {
        super(name, description, PictureId, value, category, listings);
        this.year = year;
        this.location = location;
        this.condition = condition;
    }

    public Vehicle(String name, int PictureId, double value, CATEGORY category, ArrayList<Listing> listings, int year, String location,
        CONDITION
        condition) {
        super(name, PictureId, value, category, listings);
        this.year = year;
        this.location = location;
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CONDITION getCondition() {
        return condition;
    }

    public void setCondition(CONDITION condition) {
        this.condition = condition;
    }
}
