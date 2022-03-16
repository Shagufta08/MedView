package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    //variables for anim
    Animation topAnim , bottomAnim;
    //splash screen elemnts
    ImageView imageViewBig , imageViewSmall;
    TextView textView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        //load animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_splash_anim);
        bottomAnim =AnimationUtils.loadAnimation(this,R.anim.bottom_splash_anim);

        imageViewBig =findViewById(R.id.imageView);
        imageViewSmall=findViewById(R.id.imageView2);
        textView=findViewById(R.id.textView);

        imageViewBig.setAnimation(topAnim);
        imageViewSmall.setAnimation(bottomAnim);
       textView.setAnimation(bottomAnim);



        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
                Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend", false);

                if (isIntroActivityOpnendBefore) {
                    startActivity(new Intent(SplashActivity.this, ChoiceActivity.class));
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
        }, 5000);
    }
}