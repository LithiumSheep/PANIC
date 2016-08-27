package com.example.jessexx.panic.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.jessexx.panic.R;
import com.github.clans.fab.FloatingActionButton;
import com.reimaginebanking.api.nessieandroidsdk.requestclients.NessieClient;

public class UserAssetActivity extends AppCompatActivity {

    NessieClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_assets);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupFAB();
        initialTasks();
    }

    private void setupFAB() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "fab tapped", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initialTasks() {
        client = NessieClient.getInstance("api_key");

    }
}
