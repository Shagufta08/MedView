package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

//        if (!sharedPreferences.getBoolean(OnboardingFragment.COMPLETED_ONBOARDING_PREF_NAME, false)) {
//            // The user hasn't seen the OnboardingSupportFragment yet, so show it
//            startActivity(new Intent(this, IntroActivity.class));
//        }
    }
}