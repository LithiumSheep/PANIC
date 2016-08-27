package com.example.jessexx.panic.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.jessexx.panic.Adapters.AssetAdapter;
import com.example.jessexx.panic.Data.AppData;
import com.example.jessexx.panic.R;
import com.example.jessexx.panic.Utils.HelperUtil;
import com.github.clans.fab.FloatingActionButton;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.reimaginebanking.api.nessieandroidsdk.requestclients.NessieClient;

public class UserAssetActivity extends AppCompatActivity {

    NessieClient client;
    Context mContext;
    RecyclerView mRecycler;
    AssetAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_assets2);

   //     Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        setSupportActionBar(toolbar);
        mContext = this;
//
//        setupFAB();
       // initToolBar();
        initialTasks();
    }

    private void initToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle(R.string.looking_good);


        }
    }

    private void initialTasks() {
        //client = NessieClient.getInstance("7ec5f73cf2cb3f27c03642a4b277a951");

        mRecycler = (RecyclerView) findViewById(R.id.recycler);

        mRecycler.setAdapter(mAdapter);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));

        AssetAdapter adapter = new AssetAdapter(this, AppData.getUsers().get(1).getAssets());
        mRecycler.setAdapter(adapter);
    }

    private void setupFAB() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab==null)return;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "fab tapped", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, AssetAddActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_panic) {
            Toast.makeText(mContext, "PANIC MODE", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
