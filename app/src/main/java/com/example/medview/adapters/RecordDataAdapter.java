package com.example.medview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medview.R;
import com.example.medview.models.PatientHealthRecord;

import java.util.List;

public class RecordDataAdapter extends RecyclerView.Adapter<RecordDataAdapter.ViewHolder> {
    Context context;
    List<PatientHealthRecord> recordList;

    public RecordDataAdapter(Context context, List<PatientHealthRecord> recordList) {
        this.context = context;
        this.recordList = recordList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.record_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (recordList != null && recordList.size() > 0) {
            PatientHealthRecord model = recordList.get(position);
            holder.reportName.setText(model.getReportName());
            holder.prescription.setText(model.getPrescriptionDetail());

        }else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView reportName, prescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            reportName = itemView.findViewById(R.id.report_name);
            prescription = itemView.findViewById(R.id.prescription_desc);

        }
    }
}
