package com.example.rku_ierpac_system;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SubjectWiseFragment extends Fragment {

    private RecyclerView recyclerView;
    private SubjectWiseAttendanceAdapter adapter;
    private List<SubjectAttendanceModel> subjectList;

    public SubjectWiseFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subject_wise, container, false);

        recyclerView = view.findViewById(R.id.subjectAttendanceRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize sample subject attendance data
        subjectList = new ArrayList<>();
        subjectList.add(new SubjectAttendanceModel("System Analysis And Design", 16, 1, 15, 93.75));
        subjectList.add(new SubjectAttendanceModel("Internet of Things", 16, 1, 15, 93.75));
        subjectList.add(new SubjectAttendanceModel("Android Programming", 16, 1, 15, 93.75));
        subjectList.add(new SubjectAttendanceModel("Python", 16, 1, 15, 93.75));

        adapter = new SubjectWiseAttendanceAdapter(subjectList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
