package com.example.medview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medview.R;
import com.example.medview.models.Illness;
import com.example.medview.models.PatientHealthRecord;

import java.util.List;

public class IllnessDataAdapter extends RecyclerView.Adapter<IllnessDataAdapter.ViewHolder> {

    Context context;
    List<Illness> illnessList;

    public IllnessDataAdapter(Context context, List<Illness> illnessList) {
        this.context = context;
        this.illnessList = illnessList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.illness_item_layout,parent,false);
        return new IllnessDataAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (illnessList != null && illnessList.size() > 0) {
            Illness model = illnessList.get(position);
            holder.name.setText(model.getIllness());
            holder.type.setText(model.getType());

        }else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return illnessList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView type, name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.illness_tv);
            type = itemView.findViewById(R.id.illness_type_tv);
        }
    }
}
