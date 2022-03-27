package com.example.medview.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medview.R;
import com.example.medview.adapters.IllnessDataAdapter;
import com.example.medview.adapters.RecordDataAdapter;
import com.example.medview.models.Illness;
import com.example.medview.models.PatientHealthRecord;

import java.util.ArrayList;
import java.util.List;

public class IllnessActivity extends AppCompatActivity {


    RecyclerView illnessRecyclerView;
    IllnessDataAdapter illnessDataAdapter;

    List<Illness> illnessList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illness);


        illnessRecyclerView = findViewById(R.id.illness_recycler_view);
        illnessRecyclerView .setLayoutManager(new LinearLayoutManager(this));

        illnessList.add(new Illness("Covid 19","Infectious illness"));
        illnessList.add(new Illness("Night blindness","Deficiency illness"));
        illnessList.add(new Illness("Diabetes","Hereditary illness"));
        illnessList.add(new Illness("Asthma","Physiological illness"));
        illnessList.add(new Illness("Fatigue","Infectious illness"));
        illnessList.add(new Illness("Alzheimer","Hereditary illness"));
        illnessList.add(new Illness("Rickets","Deficiency illness"));


        illnessDataAdapter = new IllnessDataAdapter(IllnessActivity.this, illnessList);
        illnessRecyclerView.setAdapter(illnessDataAdapter);

    }
}