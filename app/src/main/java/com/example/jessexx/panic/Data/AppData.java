package com.example.jessexx.panic.Data;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.Models.Bank;
import com.example.jessexx.panic.Models.Home;
import com.example.jessexx.panic.Models.Listing;
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
        users = new ArrayList<>();
        populateUsers();
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
            Asset.CATEGORY.BANK,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing("https://www.capitalone.com/", 10)
                ))
        );

        Asset home = new Home(
            "Capital One Headquarters",
            "Home sweet home",
            1,
            100000000.00,
            Asset.CATEGORY.HOME,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing("http://www.capitalonecareers.com/mclean", 100000000.00, 11)
                )),
            "1680 Capital One Drive, Mclean, Virginia, 22102"

        );

        Asset car = new Vehicle(
            "My Baby <3",
            "I love this car more than my wife.",
            2,
            500000.00,
            Asset.CATEGORY.VEHICLE,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing(
                        "https://www.truecar.com/used-cars-for-sale/listing/ZFF65TJA2E0198089/2014-ferrari-california/",
                        169995.00, 12),
                    new Listing(
                        "https://www.cargurus.com/Cars/l-Used-Ferrari-m25#listing=149323786",
                        338000.00, 13),
                    new Listing(
                        "http://preowned.ferrari.com/en/US/search/2003/ferrari/enzo/rosso_corsa-Boardwalk_Ferrari-ZFFCW56A730133028",
                        3400000.00, 14)
                )),
            2016,
            "Mclean, Virginia",
            Vehicle.CONDITION.LIKE_NEW
        );

        Asset bike = new Other(
            "Bike",
            "I literally never use this thing",
            3,
            1000.00,
            Asset.CATEGORY.OTHER,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing(
                        "http://washingtondc.craigslist.org/nva/bik/5750797624.html",
                        1100.00, 15),
                    new Listing(
                        "http://washingtondc.craigslist.org/nva/bik/5753656876.html",
                        600.00, 16),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5730655590.html",
                        2500, 17),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5746694296.html",
                        1600, 18)
                )
            ));

        Asset tv = new Other(
            "Flatscreen TV",
            "100 inches babyyy",
            4,
            10000.00,
            Asset.CATEGORY.OTHER,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing(
                        "http://washingtondc.craigslist.org/nva/bik/5750797624.html",
                        1100.00, 19),
                    new Listing("http://washingtondc.craigslist.org/nva/bik/5753656876.html",
                        600.00, 20),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5730655590.html",
                        2500, 21),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5746694296.html",
                        1600, 22)
                )
            ));

        Asset laptop = new Other(
            "Macbook 15",
            "Mac 5lyfe",
            5,
            20000.00,
            Asset.CATEGORY.OTHER,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing(
                        "http://washingtondc.craigslist.org/nva/bik/5750797624.html",
                        1100.00, 23),
                    new Listing("http://washingtondc.craigslist.org/nva/bik/5753656876.html",
                        600.00, 24),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5730655590.html",
                        2500, 25),
                    new Listing(
                        "http://washingtondc.craigslist.org/mld/bid/5746694296.html",
                        1600, 26)
                )
            ));

        Asset dog = new Other(
            "Capone",
            "Yorkshire Terrier (More like Yorkshire Terror though). My wife loves this thing but I hate all its yapping",
            6,
            750.00,
            Asset.CATEGORY.OTHER,
            new ArrayList<Listing>(
                Arrays.asList(
                    new Listing(
                        "dog",
                        0.00,
                        9999)
                )
            ));

        return new ArrayList<Asset>(Arrays.<Asset>asList(bank, home, car, bike, tv, laptop, dog));
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}

