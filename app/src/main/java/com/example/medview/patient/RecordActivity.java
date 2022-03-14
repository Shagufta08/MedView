package com.example.medview.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medview.R;
import com.example.medview.adapters.RecordDataAdapter;
import com.example.medview.models.PatientHealthRecord;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        recordRecyclerView = (RecyclerView) findViewById(R.id.patient_record_list);
        recordRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        String reportName="reportName",date,hospital="hospital",doctor="Dr. Satyendra", disease="Persistent cough", prescription="sample prescription";

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        date = df.format(c);

        //hardcorded
        recordList.add(new PatientHealthRecord(reportName, date, hospital,doctor, disease, prescription));
        recordList.add(new PatientHealthRecord(reportName, date, hospital,doctor, disease, prescription));
        recordList.add(new PatientHealthRecord(reportName, date, hospital,doctor, disease, prescription));

        recordDataAdapter = new RecordDataAdapter(RecordActivity.this, recordList);
        recordRecyclerView.setAdapter(recordDataAdapter);

//        fetchRecordData();
    }
}