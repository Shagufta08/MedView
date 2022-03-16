package com.example.medview.Patientsfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.medview.R;
import com.example.medview.patient.AddRecordActivity;


public class RecordsFragment extends Fragment {


    private ImageButton addrecord_btn;

    public RecordsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View item = inflater.inflate(R.layout.fragment_records, container, false);
        addrecord_btn = item.findViewById(R.id.addrecord_igbtn);

        addrecord_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddRecordActivity.class);
                startActivity(intent);
            }
        });
        return item;
    }
}