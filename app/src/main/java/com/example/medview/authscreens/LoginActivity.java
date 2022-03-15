package com.example.medview.authscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.medview.ChoiceActivity;
import com.example.medview.MainActivity;
import com.example.medview.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn1= (Button) findViewById(R.id.btn_login);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,
                       MainActivity.class));
            }
        });

        TextView btn2= (TextView) findViewById(R.id.new_user);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,
                        ChoiceActivity.class));
            }
        });

    }
}