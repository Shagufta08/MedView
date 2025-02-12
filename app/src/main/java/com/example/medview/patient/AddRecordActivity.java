package com.example.medview.patient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medview.R;

import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;

public class AddRecordActivity extends AppCompatActivity {

    private Button filepickerbtn;

    private int REQ_FILE_CODE = 101;
    private String filepath;
    private TextView filepathtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);


        filepickerbtn = findViewById(R.id.choosefilebtn);
        filepathtv = findViewById(R.id.filepathtv);

        filepickerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filePicker();
            }
        });
    }

    private void uploadFile() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Uploading file");
        //progressDialog.show();

        //logic to upload file
        //on success progressdialog dismiss

        Toast.makeText(getApplicationContext(), "File uploaded successfully", Toast.LENGTH_SHORT).show();

    }
    private void filePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("application/pdf");
        intent = Intent.createChooser(intent, "Select document file");
        startActivityForResult(intent, REQ_FILE_CODE);
//        intent.setAction(Intent.ACTION_GET_CONTENT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQ_FILE_CODE && resultCode == RESULT_OK && data!=null) {
            Uri path = data.getData();

            try {
                File file = new File(path.getPath());
                final String split[] = file.getPath().split(":");
                filepath = path.getEncodedPath().toString();
                filepathtv.setText(filepath);
                uploadFile();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}