package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.medview.models.SliderScreenItem;
import com.example.medview.onboarding.SliderViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager mScreenPager;
    private SliderViewPagerAdapter sliderViewPagerAdapter;

    TabLayout tabIndicator;
    int position = 0;
    Button btnNext;
    Animation btnAnim;
    Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        final List<SliderScreenItem> screenItemList = new ArrayList<>();
//        fileList()
        screenItemList.add(new SliderScreenItem(R.string.example_heading, R.string.example_desc,  R.drawable.ic_undraw_medical_research_qg4d));
        screenItemList.add(new SliderScreenItem(R.string.example_heading, R.string.example_desc,  R.drawable.ic_undraw_medicine_b_1_ol));
        screenItemList.add(new SliderScreenItem(R.string.example_heading, R.string.example_desc,  R.drawable.ic_undraw_secure_files_re_6vdh));


        // when this activity is about to be launch we need to check if its openened before or not

//        if (restorePrefData()) {
//
//            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class );
//            startActivity(mainActivity);
//            finish();
//
//        }

        setContentView(R.layout.activity_intro);

        btnNext = findViewById(R.id.btnNext);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tabIndicatorLayout);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btn_animation);
//        tvSkip = findViewById(R.id.tv_skip);


        mScreenPager = findViewById(R.id.introViewPager);
        sliderViewPagerAdapter = new SliderViewPagerAdapter(this, screenItemList);
        mScreenPager.setAdapter(sliderViewPagerAdapter);
        tabIndicator.setupWithViewPager(mScreenPager);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = mScreenPager.getCurrentItem();
                if (position < screenItemList.size()) {
                    position++;
                    mScreenPager.setCurrentItem(position);

                }

                if (position == screenItemList.size()-1) {
                    loadLastScreen();
                }
            }
        });
        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == screenItemList.size()-1) {
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);
                savePrefsData();
                finish();
            }
        });
    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend",true);
        editor.commit();


    }

    private void loadLastScreen() {

        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        // setup animation
        btnGetStarted.setAnimation(btnAnim);
    }
}