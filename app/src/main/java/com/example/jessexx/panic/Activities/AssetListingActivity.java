package com.example.jessexx.panic.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jessexx.panic.R;

/**
 * Created by jessexx on 8/27/16.
 */
public class AssetListingActivity extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_listing);

        mContext = this;
    }
}
