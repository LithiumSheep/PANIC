package com.example.jessexx.panic.Utils;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.Models.Bank;
import com.example.jessexx.panic.Models.Home;
import com.example.jessexx.panic.Models.Other;
import com.example.jessexx.panic.Models.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessexx on 8/27/16.
 */
public class HelperUtil {

    public static ArrayList<Asset> generateMockData() {
        ArrayList<Asset> list = new ArrayList<>();

        list.add(new Bank("Bank", "Description", 0, 2000, Asset.CATEGORY.BANK));
        list.add(new Home("Home", "Description", 0, 2000, Asset.CATEGORY.HOME, "Washington DC"));
        list.add(new Vehicle("Car", "Description", 0, 2000, Asset.CATEGORY.VEHICLE, 1993, "DC", Vehicle.CONDITION.NEW));
        list.add(new Other("Other", "Description", 0, 2000, Asset.CATEGORY.OTHER));
        list.add(new Other("Other", "Description", 0, 2000, Asset.CATEGORY.OTHER));
        list.add(new Other("Other", "Description", 0, 2000, Asset.CATEGORY.OTHER));
        list.add(new Other("Other", "Description", 0, 2000, Asset.CATEGORY.OTHER));
        list.add(new Other("Other", "Description", 0, 2000, Asset.CATEGORY.OTHER));
        return list;
    }
}
