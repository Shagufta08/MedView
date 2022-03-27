package com.example.medview.doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medview.DoctorFragments.HomeFragment;
import com.example.medview.DoctorFragments.ProfileFragment;

import com.example.medview.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class DoctorHomeActivity extends AppCompatActivity {

    ChipNavigationBar navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home);


        navigationView =findViewById(R.id.bottom_nav_bar2);


        getSupportFragmentManager().beginTransaction().replace(R.id.container_doc,new HomeFragment()).commit();

        navigationView.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment=null;
                switch (i) {
                    case R.id.dashboaard_doc:
                        fragment=new HomeFragment();
                        break;
                    case R.id.profile_doc:
                        fragment=new ProfileFragment();
                        break;
                }
                if(fragment!=null)
                {getSupportFragmentManager().beginTransaction().replace(R.id.container_doc,fragment).commit();

                }
            }
        });
    }
}