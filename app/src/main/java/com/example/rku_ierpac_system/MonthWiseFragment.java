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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MonthWiseFragment extends Fragment {

    private RecyclerView recyclerView;
    private MonthWiseAdapter adapter;
    private List<AttendanceModel> attendanceList;

    public MonthWiseFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_month_wise, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewMonthWise);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        loadAttendanceData();
        adapter = new MonthWiseAdapter(attendanceList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void loadAttendanceData() {
        attendanceList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM", Locale.ENGLISH);
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEE", Locale.ENGLISH);

        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 31; i++) {
            calendar.set(Calendar.DAY_OF_MONTH, i);
            String date = sdf.format(calendar.getTime());
            String day = dayFormat.format(calendar.getTime());
            attendanceList.add(new AttendanceModel(date, day, "P", "A", "H", "P"));
        }
    }
}
