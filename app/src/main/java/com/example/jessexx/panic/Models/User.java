package com.example.jessexx.panic.Models;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class User {

    private String username;

    private String firstName;

    private String lastName;

    private String password;

    private ArrayList<Asset> assets;

    private ArrayList<String> banks;

    public User(String username, String firstName, String lastName, String password, ArrayList<Asset> assets, ArrayList<String> banks) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.assets = assets;
        this.banks = banks;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public void AddAsset(Asset asset) {
        assets.add(asset);
    }

    public void removeAsset(Asset asset) {
        for (int i = 0; i < assets.size(); i++) {
            if (asset.getId() == assets.get(i).getId()) {
                assets.remove(i);
            }
        }
    }

    public ArrayList<String> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<String> banks) {
        this.banks = banks;
    }
}