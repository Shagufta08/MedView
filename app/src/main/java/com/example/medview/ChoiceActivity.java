package com.example.medview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medview.authscreens.LoginUserActivity;
import com.example.medview.doctor.RegisterDoctorActivity;
import com.example.medview.authscreens.RegisterUserActivity;

public class ChoiceActivity extends AppCompatActivity {

    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
         btn1= (Button) findViewById(R.id.btn_medical);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this,
                        RegisterDoctorActivity.class));
            }
        });

        btn2= (Button) findViewById(R.id.btn_user);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ChoiceActivity.this,
                        LoginUserActivity.class));
            }
        });
    }
}