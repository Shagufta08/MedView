package com.example.medview.DoctorFragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medview.R;
import com.example.medview.doctor.DoctorHomeActivity;
import com.example.medview.doctor.SearchUserActivity;


public class HomeFragment extends Fragment {

    SearchView searchView;
    ProgressDialog progressDialog;
    TextView serchatv;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View item = inflater.inflate(R.layout.fragment_home, container, false);
        searchView = item.findViewById(R.id.searchView);

        serchatv = item.findViewById(R.id.searchtv);

//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                serchatv.setText(query);
                if(query.equals("123")) startActivity(new Intent(getActivity(), SearchUserActivity.class));
                else Toast.makeText(getActivity(), "User not found!", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return item;
    }
}