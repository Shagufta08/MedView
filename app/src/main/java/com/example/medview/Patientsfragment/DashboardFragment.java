package com.example.medview.Patientsfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medview.R;
import com.example.medview.patient.IllnessActivity;
import com.example.medview.patient.RecordActivity;

public class DashboardFragment extends Fragment {


    private CardView illness_cv_btn, docs_cv_btn, profile_cv_btn;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View item = inflater.inflate(R.layout.fragment_dashboard, container, false);
        illness_cv_btn = item.findViewById(R.id.dashboaard_illness_cv);
        docs_cv_btn= item.findViewById(R.id.dashboaard_docs_cv);
        profile_cv_btn = item.findViewById(R.id.dashboaard_profile_cv);

        illness_cv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), IllnessActivity.class));
            }
        });
        docs_cv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RecordActivity.class));
            }
        });

        profile_cv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new ProfileFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return item;
    }
}