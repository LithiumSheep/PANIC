package com.example.jessexx.panic.Data;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.Models.Bank;
import com.example.jessexx.panic.Models.Home;
import com.example.jessexx.panic.Models.Other;
import com.example.jessexx.panic.Models.User;
import com.example.jessexx.panic.Models.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mdt549 on 8/27/16.
 */
public class AppData {

    private static AppData instance = null;

    private static ArrayList<User> users;

    private AppData() {
    }

    public static AppData getAppData() {
        if (instance == null) {
            instance = new AppData();
        }
        return instance;
    }

    private void populateUsers() {
        users.add(new User(
            "lowlyemployee",
            "Aki",
            "Gao",
            "1234",
            new ArrayList<Asset>(),
            new ArrayList<>(Arrays.asList("Capital One Checking", "Capital One Saving"))
        ));

        users.add(new User(
            "iownyou",
            "Richard",
            "Fairbanks",
            "5678",
            populateAssets(),
            new ArrayList<>(Arrays.asList("Capital One Financial Corporation"))
        ));
    }

    private ArrayList<Asset> populateAssets() {
        Asset bank = new Bank(
            "Capital One Financial Corporation",
            "ALL THE MONEIZ",
            0,
            334048000000.00,
            Asset.CATEGORY.BANK
        );

        Asset home = new Home(
            "Capital One Headquarters",
            "Home sweet home",
            1,
            100000000.00,
            Asset.CATEGORY.HOME,
            "1680 Capital One Drive, Mclean, Virginia, 22102"
        );

        Asset car = new Vehicle(
            "My Baby <3",
            "I love this car more than my wife.",
            2,
            500000.00,
            Asset.CATEGORY.VEHICLE,
            2016,
            "Mclean, Virginia",
            Vehicle.CONDITION.LIKE_NEW
        );

        Asset bike = new Other(
            "Bike",
            "I literally never use this thing",
            3,
            1000.00,
            Asset.CATEGORY.OTHER
        );

        Asset tv = new Other(
            "Flatscreen TV",
            "100 inches babyyy",
            4,
            10000.00,
            Asset.CATEGORY.OTHER
        );

        Asset laptop = new Other(
            "Macbook 15",
            "Mac 5lyfe",
            5,
            20000.00,
            Asset.CATEGORY.OTHER
        );

        Asset dog = new Other(
            "Capone",
            "Yorkshire Terrier (More like Terror though). My wife loves this thing but I hate all its yapping",
            6,
            750.00,
            Asset.CATEGORY.OTHER
        );

        return new ArrayList<Asset>(Arrays.<Asset>asList(bank, home, car, bike, tv, laptop, dog));
    }

}

