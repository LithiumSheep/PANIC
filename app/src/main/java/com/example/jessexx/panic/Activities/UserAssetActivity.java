package com.example.jessexx.panic.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jessexx.panic.R;
import com.reimaginebanking.api.nessieandroidsdk.requestclients.NessieClient;

public class UserAssetActivity extends AppCompatActivity {

    NessieClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_assets);



        initialTasks();
    }

    private void initialTasks() {
        client = NessieClient.getInstance("api_key");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
