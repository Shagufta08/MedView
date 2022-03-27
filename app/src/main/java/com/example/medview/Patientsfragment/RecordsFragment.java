package com.example.medview.Patientsfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.medview.R;
import com.example.medview.patient.AddRecordActivity;
import com.example.medview.patient.RecordActivity;


public class RecordsFragment extends Fragment {


    private ImageButton addrecord_btn;
    private CardView docscv, adddocscv;

    public RecordsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View item = inflater.inflate(R.layout.fragment_records, container, false);
//        addrecord_btn = item.findViewById(R.id.addrecord_igbtn);

        adddocscv = item.findViewById(R.id.add_doc_cv);
        docscv = item.findViewById(R.id.current_docs_cv);

        docscv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RecordActivity.class));
            }
        });

        adddocscv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddRecordActivity.class);
                startActivity(intent);
            }
        });
        return item;
    }
}