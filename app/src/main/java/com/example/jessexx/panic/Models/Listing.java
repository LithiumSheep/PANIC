package com.example.jessexx.panic.Models;

/**
 * Created by mdt549 on 8/27/16.
 */
public class Listing {
    private String url;
    private double value;
    private int iconId;

    public Listing(String url, double value, int iconId) {
        this.url = url;
        this.value = value;
        this.iconId = iconId;
    }

    public Listing(String url, int iconId){
        this(url, 0.0, iconId);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}
