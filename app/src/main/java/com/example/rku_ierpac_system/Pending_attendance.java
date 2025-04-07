package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pending_attendance extends AppCompatActivity {

    LinearLayout FillAttendance_Wise,FillAttendance_Wise2,FillAttendance_Wise3,FillAttendance_Wise4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pending_attendance);

        FillAttendance_Wise = findViewById(R.id.FillAttendance_Wise);
        FillAttendance_Wise2 = findViewById(R.id.FillAttendance_Wise2);
        FillAttendance_Wise3 = findViewById(R.id.FillAttendance_Wise3);
        FillAttendance_Wise4 = findViewById(R.id.FillAttendance_Wise4);



        FillAttendance_Wise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Pending_attendance.this, FillAttendance_faculty.class);
                startActivity(in);
            }
        });

        FillAttendance_Wise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Pending_attendance.this, FillAttendance_faculty.class);
                startActivity(in);
            }
        });

        FillAttendance_Wise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Pending_attendance.this, FillAttendance_faculty.class);
                startActivity(in);
            }
        });

        FillAttendance_Wise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Pending_attendance.this, FillAttendance_faculty.class);
                startActivity(in);
            }
        });

        FillAttendance_Wise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Pending_attendance.this, FillAttendance_faculty.class);
                startActivity(in);
            }
        });



    }
}