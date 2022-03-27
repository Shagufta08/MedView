package com.example.medview.doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medview.R;
import com.example.medview.patient.IllnessActivity;
import com.example.medview.patient.RecordActivity;

public class SearchUserActivity extends AppCompatActivity {
private CardView patient_record , patient_documents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail_history);

      patient_record= findViewById(R.id.patient_records);
      patient_documents=findViewById(R.id.pateint_documents);

        patient_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchUserActivity.this,
                      IllnessActivity.class));

            }
        });

        patient_documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchUserActivity.this,
                        RecordActivity.class));

            }
        });

    }
}