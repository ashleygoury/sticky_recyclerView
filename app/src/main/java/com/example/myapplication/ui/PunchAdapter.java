package com.example.myapplication.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.PunchEntity;

import java.util.List;

public class PunchAdapter extends RecyclerView.Adapter<PunchAdapter.ViewHolder> {

    private final List<PunchEntity> mPunch;
    private final LayoutInflater layoutInflater;
    private final int rowLayout;

    public PunchAdapter(LayoutInflater layoutInflater, List<PunchEntity> mPunch, int rowLayout) {
        this.mPunch = mPunch;
        this.layoutInflater = layoutInflater;
        this.rowLayout = rowLayout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(rowLayout,
                parent,
                false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final PunchEntity punchEntity = mPunch.get(position);

        holder.txtDate.setText(punchEntity.getDate());
        holder.txtBreaks.setText(punchEntity.getBreaks());
        holder.txtHours.setText(String.valueOf(punchEntity.getHours()));
    }

    @Override
    public int getItemCount() {
        return mPunch.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtDate;
        public TextView txtBreaks;
        public TextView txtHours;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDate = itemView.findViewById(R.id.txtDate);
            txtBreaks = itemView.findViewById(R.id.txtBreaks);
            txtHours = itemView.findViewById(R.id.txtHours);
        }
    }
}
