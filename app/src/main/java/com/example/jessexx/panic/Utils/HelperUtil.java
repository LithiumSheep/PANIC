package com.example.jessexx.panic.Utils;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.Models.Bank;
import com.example.jessexx.panic.Models.Home;
import com.example.jessexx.panic.Models.Other;
import com.example.jessexx.panic.Models.Vehicle;

import java.util.ArrayList;

/**
 * Created by jessexx on 8/27/16.
 */
public class HelperUtil {

    public static ArrayList<Asset> generateMockData() {
        ArrayList<Asset> list = new ArrayList<>();

        /*list.add(new Bank("Capitol One Bank Acct", "Capitol One is the best bank ever", 0, 2123.13, Asset.CATEGORY.BANK));
        list.add(new Home("Home", "My own house!", 0, 300000, Asset.CATEGORY.HOME, "2321 Lincoln Road Northeast, Washington, DC 20002"));
        list.add(new Vehicle("1993 Honda Accord", "old, beat-up junker", 0, 2500, Asset.CATEGORY.VEHICLE, 1993, "Washington, DC", Vehicle.CONDITION.USED));
        list.add(new Other("XBox", "XBox One bought in 2010", 0, 120, Asset.CATEGORY.OTHER));
        list.add(new Other("Stereo Speakers", "I love these speakers", 0, 400, Asset.CATEGORY.OTHER));
        list.add(new Other("Desktop", "I hope I don't have to sell my baby", 0, 1890, Asset.CATEGORY.OTHER));
        list.add(new Other("Monitor", "", 0, 230, Asset.CATEGORY.OTHER));
        list.add(new Other("Keyboard and Mouse", "", 0, 145, Asset.CATEGORY.OTHER));*/
        return list;
    }
}
