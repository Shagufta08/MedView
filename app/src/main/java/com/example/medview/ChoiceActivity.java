package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medview.authscreens.LoginActivity;
import com.example.medview.doctor.RegisterDoctorActivity;
import com.example.medview.patient.RegisterUserActivity;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button btn1= (Button) findViewById(R.id.btn_medical);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this,
                        RegisterDoctorActivity.class));
            }
        });

        Button btn2= (Button) findViewById(R.id.btn_user);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this,
                        RegisterUserActivity.class));
            }
        });
    }
}