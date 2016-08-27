package com.example.jessexx.panic.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        int year = bundle.getInt("year", 0);
        String location = bundle.getString("location", "No Location");
        String condition = bundle.getString("condition", "No condition");

        TextView nameDetail = (TextView) findViewById(R.id.name_detail);
        nameDetail.setText(name);
        TextView descriptionDetail = (TextView) findViewById(R.id.description_detail);
        descriptionDetail.setText(description);
        TextView yearDetail = (TextView) findViewById(R.id.year_detail);
        yearDetail.setText(Integer.toString(year));
        TextView locationDetail = (TextView) findViewById(R.id.location_detail);
        locationDetail.setText(location);
        TextView conditionDetail = (TextView) findViewById(R.id.condition_detail);
        conditionDetail.setText(condition);

        Button listingButton = (Button) findViewById(R.id.listings_button);
        if (name.contains("Bank")) {
            listingButton.setVisibility(View.GONE);
        }
        listingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Go to listings on this category", Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(mContext, AssetListingActivity.class);
                startActivity(intent);*/
            }
        });
    }
}
