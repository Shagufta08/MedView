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

        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));
        illnessList.add(new Illness("Sample illness","illness type"));


        illnessDataAdapter = new IllnessDataAdapter(IllnessActivity.this, illnessList);
        illnessRecyclerView.setAdapter(illnessDataAdapter);

    }
}