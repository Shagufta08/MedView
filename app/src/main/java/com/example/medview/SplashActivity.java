package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
                Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend", false);

                if (isIntroActivityOpnendBefore) {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                } else {

                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean("isIntroOpnend", true);
                    editor.commit();

                    Intent intent = new Intent(SplashActivity.this, IntroActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);
    }
}