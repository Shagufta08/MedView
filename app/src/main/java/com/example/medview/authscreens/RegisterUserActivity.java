package com.example.medview.authscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medview.MainActivity;
import com.example.medview.R;

public class RegisterUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Button btn1= (Button) findViewById(R.id.btn_continue);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RegisterUserActivity.this,
                        MainActivity.class));
                finish();
            }
        });
    }
}