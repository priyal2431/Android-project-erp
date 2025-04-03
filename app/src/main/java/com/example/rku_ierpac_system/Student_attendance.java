package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Student_attendance extends AppCompatActivity {

    ImageView attandance_left ;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private AttendancePagerAdapter pagerAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendance);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        attandance_left = findViewById(R.id.attendance_left);

        pagerAdapter = new AttendancePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);

        // Ensures tabs remain visible
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0) {
                    tab.setText("Month Wise");
                } else {
                    tab.setText("Subject Wise");
                }
            }
        }).attach();

        attandance_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Student_attendance.this, dashboardst.class);
                startActivity(in);
            }
        });
    }
}
