package com.example.rku_ierpac_system;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SubjectWiseAttendanceAdapter extends RecyclerView.Adapter<SubjectWiseAttendanceAdapter.ViewHolder> {

    private List<SubjectAttendanceModel> subjectList;

    public SubjectWiseAttendanceAdapter(List<SubjectAttendanceModel> subjectList) {
        this.subjectList = subjectList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_subject_attendance, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SubjectAttendanceModel subject = subjectList.get(position);
        holder.subjectName.setText(subject.getSubjectName());
        holder.totalLectures.setText("Total Lecture: " + subject.getTotalLectures());
        holder.remainingLectures.setText("Remain Lecture: " + subject.getRemainingLectures());
        holder.presentLectures.setText("Present In Lecture: " + subject.getPresentLectures());
        holder.attendancePercentage.setText("Attendance In(%): " + subject.getAttendancePercentage() + "%");
    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView subjectName, totalLectures, remainingLectures, presentLectures, attendancePercentage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName = itemView.findViewById(R.id.subjectName);
            totalLectures = itemView.findViewById(R.id.totalLectures);
            remainingLectures = itemView.findViewById(R.id.remainingLectures);
            presentLectures = itemView.findViewById(R.id.presentLectures);
            attendancePercentage = itemView.findViewById(R.id.attendancePercentage);
        }
    }
}
