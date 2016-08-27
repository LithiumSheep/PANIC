package com.example.jessexx.panic.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jessexx.panic.Data.AppData;
import com.example.jessexx.panic.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AppData.getAppData();

        if (isUserLoggedIn()) {
            Intent intent = new Intent(this, UserAssetActivity.class);
            startActivity(intent);
        }g
        setupButton();
    }

    public boolean isUserLoggedIn() {
        return false;
    }

    private void setupButton() {
        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        if (verify()) {
            Intent intent = new Intent(this, UserAssetActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Error on login", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean verify() {
        // check user login details
        return true;
    }

}

