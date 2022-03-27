package com.example.medview.Patientsfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.medview.R;
import com.example.medview.patient.IllnessActivity;
import com.example.medview.patient.RecordActivity;

import java.nio.charset.StandardCharsets;


public class ProfileFragment extends Fragment {
    private CardView illness_cv, records_cv;
    private TextView usrrname, age, height, weight, bloodgr, phone;

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

        Intent intent = getActivity().getIntent();



        if (intent.getExtras() != null){
//            String name = intent.get("data");

            usrrname = item.findViewById(R.id.user_name_tv);
            phone = item.findViewById(R.id.user_phone_tv);
            age = item.findViewById(R.id.user_age);
            bloodgr = item.findViewById(R.id.user_blood);
            weight = item.findViewById(R.id.user_wt);
            height = item.findViewById(R.id.user_height);

            String name ="";
            String phone_val = "";
            String bloodgr_val = "";
            String height_val = "";
            String weight_val = "";
            String age_val = "";

            usrrname.setText(name);
            phone.setText(phone_val);

            bloodgr.setText(bloodgr_val);
            weight.setText(weight_val);
            height.setText(height_val);
            age.setText(age_val);
        }
        return item;
    }
}