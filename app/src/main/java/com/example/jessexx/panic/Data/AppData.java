package com.example.jessexx.panic.Data;

import com.example.jessexx.panic.Models.User;

import java.util.ArrayList;

/**
 * Created by mdt549 on 8/27/16.
 */
public class AppData {

    private static AppData instance = null;
    private static ArrayList<User> users = new ArrayList<User>();

    public static AppData getInstance() {
        if(instance == null){
            instance = new AppData();
        }
        return instance;
    }

    private AppData() {

    }
}
