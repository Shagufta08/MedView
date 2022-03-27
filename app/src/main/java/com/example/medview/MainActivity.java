package com.example.medview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.medview.Patientsfragment.DashboardFragment;
import com.example.medview.Patientsfragment.ProfileFragment;
import com.example.medview.Patientsfragment.RecordsFragment;
import com.example.medview.patient.RecordActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ChipNavigationBar navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigationView =findViewById(R.id.bottom_nav_bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new DashboardFragment()).commit();

        navigationView.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment=null;
                switch (i) {
                    case R.id.dashboaard:
                        fragment=new DashboardFragment();
                        break;
                    case R.id.profile:
                        fragment=new ProfileFragment();
                        break;
                    case R.id.records:
                        fragment=new RecordsFragment();
                        break;
                }
                if(fragment!=null)
                {getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

                }
            }
        });



//        btn = findViewById(R.id.recordbtn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, RecordActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}