package com.example.rku_ierpac_system;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.ViewHolder> {
    private List<TimetableModel> timetableList;

    public TimetableAdapter(List<TimetableModel> timetableList) {
        this.timetableList = timetableList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_timetable, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TimetableModel item = timetableList.get(position);
        holder.time.setText(item.getTime());
        holder.subject.setText(item.getSubject());
        holder.faculty.setText(item.getFaculty());
        holder.classroom.setText(item.getClassroom());
    }

    @Override
    public int getItemCount() {
        return timetableList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView time, subject, faculty, classroom;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time);
            subject = itemView.findViewById(R.id.subject);
            faculty = itemView.findViewById(R.id.faculty);
            classroom = itemView.findViewById(R.id.classRoom);
        }
    }
}
