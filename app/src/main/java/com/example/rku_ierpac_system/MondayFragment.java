package com.example.rku_ierpac_system;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class MondayFragment extends Fragment {
    private RecyclerView recyclerView;
    private TimetableAdapter adapter;
    private List<TimetableModel> timetableList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monday, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Static Data
        timetableList = new ArrayList<>();
        timetableList.add(new TimetableModel("08:00 AM - 09:00 AM", "Mathematics", "Prof. Sharma", "Room 101"));
        timetableList.add(new TimetableModel("09:00 AM - 10:00 AM", "Android Development", "Prof. Patel", "Lab 2"));
        timetableList.add(new TimetableModel("10:00 AM - 11:00 AM", "Database Management", "Prof. Mehta", "Room 102"));
        timetableList.add(new TimetableModel("11:00 AM - 12:00 PM", "Networking", "Prof. Trivedi", "Lab 3"));
        timetableList.add(new TimetableModel("12:00 PM - 01:00 PM", "Operating Systems", "Prof. Bhatt", "Room 104"));

        adapter = new TimetableAdapter(timetableList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
