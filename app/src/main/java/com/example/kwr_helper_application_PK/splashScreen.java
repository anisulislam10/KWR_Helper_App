package com.example.kwr_helper_application_PK;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        // Using handler with postDelayed called runnable run method
        new Handler().postDelayed(() -> {

            Intent i = new Intent(splashScreen.this, LoginActivity.class);

            startActivity(i);


            finish();

        }, 5*1000); // wait for 5 seconds
    }
}