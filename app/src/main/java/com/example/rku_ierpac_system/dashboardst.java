package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;

public class dashboardst extends AppCompatActivity {

    CardView cv,student_attendance,contact_us_student,time_table_student;

    ViewPager2 vp2;
    ImageView imageView;
    int ViewPagerImage_2[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.RED);

        // Set the layout first
        setContentView(R.layout.activity_dashboardst);

        cv = findViewById(R.id.Holiday);
        student_attendance = findViewById(R.id.student_attendance);
        contact_us_student = findViewById(R.id.contact_us_student);
        time_table_student = findViewById(R.id.time_table_student);
        imageView = findViewById(R.id.Student_profile_image);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboardst.this, Student_profile.class);
                startActivity(in);
            }
        });

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboardst.this, holiday.class);
                startActivity(in);
            }
        });

        student_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboardst.this, Student_attendance.class);
                startActivity(in);
            }
        });

        contact_us_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboardst.this,contact_us_student.class);
                startActivity(in);
            }
        });

        time_table_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboardst.this, Time_Table_Student.class);
                startActivity(in);
            }
        });

        vp2 = findViewById(R.id.viewPager);
        ViewPagerAdapter vpa = new ViewPagerAdapter(getApplication(), ViewPagerImage_2);
        vp2.setAdapter(vpa);
        vp2.setCurrentItem(0);
    }
}
