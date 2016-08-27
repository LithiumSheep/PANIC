package com.example.jessexx.panic.Activities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.jessexx.panic.R;

public class AssetDetailActivity extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_detail);

        mContext = this;
        setupView();
    }

    private void setupView() {
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        String description = bundle.getString("description");

        TextView nameDetail = (TextView) findViewById(R.id.name_detail);
        nameDetail.setText(name);
        TextView descriptionDetail = (TextView) findViewById(R.id.description_detail);
        descriptionDetail.setText(description);
    }
}
