package com.example.medview.authscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medview.MainActivity;
import com.example.medview.R;
import com.example.medview.models.LoginRequestModel;
import com.example.medview.models.ResponseModel;
import com.example.medview.network.ApiService;
import com.example.medview.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginUserActivity extends AppCompatActivity {

    private EditText emailEd;
    private EditText passwdEd;

    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        Button btn1= (Button) findViewById(R.id.btn_login);

        emailEd = findViewById(R.id.input_email);
        passwdEd = findViewById(R.id.userPassword);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                login();
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

    private void login() {
//        LoginRequestModel loginRequestModel = new LoginRequestModel();
//        loginRequestModel.setUsername(String.valueOf(emailEd.getText()));
//        loginRequestModel.setPassword(String.valueOf(passwdEd.getText()));




    }
}