package com.example.medview.authscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medview.MainActivity;
import com.example.medview.R;
import com.example.medview.network.RetrofitClientInstance;

public class LoginUserActivity extends AppCompatActivity {
    private RetrofitClientInstance retrofitClientInstance = new RetrofitClientInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        Button btn1= (Button) findViewById(R.id.btn_login);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                retrofitClientInstance;
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Successful",
                        Toast.LENGTH_LONG);
                t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                t.show();
                startActivity(new Intent(LoginUserActivity.this,
                        MainActivity.class));
                finish();
            }
        });
//
        TextView newUser= (TextView) findViewById(R.id.new_user);

        newUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LoginUserActivity.this,
                        RegisterUserActivity.class));
            }
        });

    }
}