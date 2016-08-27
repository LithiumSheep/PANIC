package com.example.jessexx.panic.Interfaces;

public class Asset {

    public enum CATEGORY{
        HOME, VEHICLE, BANK, OTHER;
    }

    private String name;

    private String description;

    private int pictureID;

    private float value;

    private boolean tangible;

    private CATEGORY category;


    public Asset(){}

    public Asset(String name, String description, int pictureID, float value, CATEGORY category) {
        this.name = name;
        this.description = description;
        this.pictureID = pictureID;
        this.value = value;
        this.category = category;
    }

    public Asset(String name, int pictureID, float value, CATEGORY category) {
        this.name = name;
        this.pictureID = pictureID;
        this.value = value;
        this.category = category;
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

    public float getValue() {
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
}
