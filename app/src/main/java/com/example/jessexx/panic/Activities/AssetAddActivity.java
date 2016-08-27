package com.example.jessexx.panic.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.jessexx.panic.R;
import com.jaredrummler.materialspinner.MaterialSpinner;

public class AssetAddActivity extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_add);
        mContext = this;

        setupView();
    }

    private void setupView() {
        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
        spinner.setItems("Vehicle", "Home", "Bank", "Other");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Toast.makeText(mContext, "Selected new " + item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
