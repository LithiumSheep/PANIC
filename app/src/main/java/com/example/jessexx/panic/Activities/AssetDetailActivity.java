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
        String condition = bundle.getString("condition", "No Condition");

        TextView nameDetail = (TextView) findViewById(R.id.name_detail);
        nameDetail.setText(name);

        TextView descriptionDetail = (TextView) findViewById(R.id.description_detail);
        descriptionDetail.setText(description);

        TextView yearDetail = (TextView) findViewById(R.id.year_detail);
        yearDetail.setText(Integer.toString(year));
        if (year == 0) {g
            TextView detail = (TextView) findViewById(R.id.year_detail_header);
            yearDetail.setVisibility(View.GONE);
            detail.setVisibility(View.GONE);
        }

        TextView locationDetail = (TextView) findViewById(R.id.location_detail);
        locationDetail.setText(location);
        if (location.equals("No Location")) {
            TextView detail = (TextView) findViewById(R.id.location_detail_header);
            locationDetail.setVisibility(View.GONE);
            detail.setVisibility(View.GONE);
        }

        TextView conditionDetail = (TextView) findViewById(R.id.condition_detail);
        conditionDetail.setText(condition);
        if (condition.equals("No Condition")) {
            TextView detail = (TextView) findViewById(R.id.condition_detail_header);
            conditionDetail.setVisibility(View.GONE);
            detail.setVisibility(View.GONE);
        }

        Button listingButton = (Button) findViewById(R.id.listings_button);
        if (name.contains("Capital")) {
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
