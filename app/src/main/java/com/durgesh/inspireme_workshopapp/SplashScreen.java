package com.durgesh.inspireme_workshopapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(() -> {

            // Intent moves user to MainActivity
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);

            //start next Screen
            startActivity(intent);

//            animation
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


            // close splash activity
            finish();

        }, 5000);



    }
}