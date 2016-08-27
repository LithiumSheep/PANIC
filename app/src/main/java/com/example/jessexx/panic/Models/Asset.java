package com.example.jessexx.panic.Models;

import java.util.ArrayList;
import java.util.UUID;

public class Asset {

    public enum CATEGORY{
        HOME, VEHICLE, BANK, OTHER;
    }
    private UUID id;

    private String name;

    private String description;

    private int pictureID;

    private double value;

    private boolean tangible;

    private CATEGORY category;

    private ArrayList<Listing> listings;


    public Asset(){}

    public Asset(String name, String description, int pictureID, double value, CATEGORY category) {
        this.name = name;
        this.description = description;
        this.pictureID = pictureID;
        this.value = value;
        this.category = category;
        this.listings = new ArrayList<Listing>();
    }


    public Asset(String name, int pictureID, double value, CATEGORY category) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.pictureID = pictureID;
        this.value = value;
        this.category = category;
    }

    public UUID getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isTangible() {
        return tangible;
    }

    public void setTangible(boolean tangible) {
        this.tangible = tangible;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }


    public ArrayList<Listing> getListings() {
        return listings;
    }
}
