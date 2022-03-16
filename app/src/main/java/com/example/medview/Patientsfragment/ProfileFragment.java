package com.example.medview.Patientsfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medview.R;
import com.example.medview.patient.IllnessActivity;
import com.example.medview.patient.RecordActivity;


public class ProfileFragment extends Fragment {
    private CardView illness_cv, records_cv;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View item = inflater.inflate(R.layout.fragment_profile, container, false);

        illness_cv = item.findViewById(R.id.illness_cv);
        records_cv = item.findViewById(R.id.records_cv);

        records_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RecordActivity.class));
            }
        });
        illness_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), IllnessActivity.class));
            }
        });
        return item;
    }
}