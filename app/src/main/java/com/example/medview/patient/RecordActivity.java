package com.example.medview.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medview.MainActivity;
import com.example.medview.R;
import com.example.medview.adapters.RecordDataAdapter;
import com.example.medview.models.PatientHealthRecord;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class RecordActivity extends AppCompatActivity {

    RecyclerView recordRecyclerView;
    RecordDataAdapter recordDataAdapter;
    List<PatientHealthRecord> recordList = new ArrayList<>();

    private FloatingActionButton addRecordFabBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        recordRecyclerView = (RecyclerView) findViewById(R.id.patient_record_list);
        recordRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        addRecordFabBtn = findViewById(R.id.addrecordFabbtn);

        addRecordFabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(RecordActivity.this, AddRecordActivity.class);
//                startActivity(intent);

                startActivityForResult(new Intent(RecordActivity.this, AddRecordActivity.class), 100);
            }
        });

        String reportName="reportName";

//        Date c = Calendar.getInstance().getTime();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        date = df.format(c);

        recordList.add(new PatientHealthRecord("Covid-19 rt pcr", "Fever, cough, loss of taste and smell"));
        recordList.add(new PatientHealthRecord("Diabetes A1C test", "Excessive weight loss and increased thirst"));
        recordList.add(new PatientHealthRecord("Alzheimer CT Scan", "Difficulty thinking and understanding"));

        recordDataAdapter = new RecordDataAdapter(RecordActivity.this, recordList);
        recordRecyclerView.setAdapter(recordDataAdapter);

//        fetchRecordData();
    }
}