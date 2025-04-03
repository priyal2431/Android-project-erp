package com.example.rku_ierpac_system;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MonthWiseAdapter extends RecyclerView.Adapter<MonthWiseAdapter.ViewHolder> {

    private List<AttendanceModel> attendanceList;

    public MonthWiseAdapter(List<AttendanceModel> attendanceList) {
        this.attendanceList = attendanceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_month_attendance, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AttendanceModel attendance = attendanceList.get(position);

        holder.txtDate.setText(attendance.getDate());
        holder.txtDay.setText(attendance.getDay());
        holder.txtSlot1.setText(attendance.getSlot1());
        holder.txtSlot2.setText(attendance.getSlot2());
        holder.txtSlot3.setText(attendance.getSlot3());
        holder.txtSlot4.setText(attendance.getSlot4());

        // ✅ Correctly setting content descriptions for accessibility
        holder.txtDate.setContentDescription("Date: " + attendance.getDate());
        holder.txtDay.setContentDescription("Day: " + attendance.getDay());

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.WHITE);
        } else {
            holder.itemView.setBackgroundColor(Color.LTGRAY);
        }
    }

    @Override
    public int getItemCount() {
        return attendanceList != null ? attendanceList.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDate, txtDay, txtSlot1, txtSlot2, txtSlot3, txtSlot4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDate = itemView.findViewById(R.id.txt_date);
            txtDay = itemView.findViewById(R.id.txt_day);
            txtSlot1 = itemView.findViewById(R.id.txt_slot1);
            txtSlot2 = itemView.findViewById(R.id.txt_slot2);
            txtSlot3 = itemView.findViewById(R.id.txt_slot3);
            txtSlot4 = itemView.findViewById(R.id.txt_slot4);
        }
    }
}
