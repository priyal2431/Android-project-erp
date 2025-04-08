package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FillAttendance_faculty extends AppCompatActivity {

    ImageView back_to_dashboard_faculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fill_attendance_faculty);
        ImageView back;

        back_to_dashboard_faculty = findViewById(R.id.back_to_dashboard_faculty);

        back_to_dashboard_faculty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(FillAttendance_faculty.this, Pending_attendance.class);
                    startActivity(i);
                }
            });
    }
}