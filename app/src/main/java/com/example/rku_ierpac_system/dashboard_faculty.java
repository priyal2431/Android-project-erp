package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;


public class dashboard_faculty extends AppCompatActivity {

    ImageView imageView;
    ViewPager2 vp2;
    CardView Faculty_attendance,Faculty_TimeTable;

    int ViewPagerImage_2[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard_faculty);

        imageView = findViewById(R.id.profile_image);
        Faculty_attendance = findViewById(R.id.Faculty_Attendance);
        Faculty_TimeTable = findViewById(R.id.Faculty_TimeTable);
        vp2 = findViewById(R.id.viewPager);

        showPendingAttendanceDialog();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboard_faculty.this, faculty_profiles.class);
                startActivity(in);
            }
        });

        Faculty_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboard_faculty.this, Pending_attendance.class);
                startActivity(in);
            }
        });

        Faculty_TimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dashboard_faculty.this, Time_Table_Faculty.class);
                startActivity(in);
            }
        });
        vp2 = findViewById(R.id.viewPager);
        ViewPagerAdapter vpa = new ViewPagerAdapter(getApplication(), ViewPagerImage_2);
        vp2.setAdapter(vpa);
        vp2.setCurrentItem(0);
    }

    private void showPendingAttendanceDialog() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_pending_attendance_ft);
        dialog.setCancelable(false);

        TableLayout tableLayout = dialog.findViewById(R.id.attendanceTable);  // Corrected ID
        Button btnCancel = dialog.findViewById(R.id.btnCancle);  // Fixed typo

        String[] attendanceData = {
                "3-3-2025\nSem-IV\nA-4DCEA1\nWeb Programming Using PHP\nLecture-1\nCOMPUTER LAB(SOE)",
                "3-3-2025\nSem-IV\nA-4DCEA1\nWeb Programming Using PHP\nLecture-2\nCOMPUTER LAB(SOE)",
                "3-3-2025\nSem-IV\nA-4DCEA1\nWeb Programming Using PHP\nLecture-3\nCOMPUTER LAB(SOE)",
                "3-3-2025\nSem-IV\nA-4DCEA1\nWeb Programming Using PHP\nLecture-4\nCOMPUTER LAB(SOE)"
        };

        for (int i = 0; i < attendanceData.length; i++) {
            TableRow row = new TableRow(this);
            row.setPadding(8, 8, 8, 8);

            TextView srNo = new TextView(this);
            srNo.setText(String.valueOf(i + 1));
            srNo.setGravity(Gravity.CENTER);
            srNo.setTextColor(Color.RED);
            srNo.setTextSize(16);
            srNo.setTypeface(Typeface.DEFAULT_BOLD);
            srNo.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));

            TextView lectureDetails = new TextView(this);
            lectureDetails.setText(attendanceData[i]);
            lectureDetails.setTextColor(Color.RED);
            lectureDetails.setTextSize(14);
            lectureDetails.setPadding(10, 5, 10, 5);
            lectureDetails.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 3));

            row.addView(srNo);
            row.addView(lectureDetails);

            row.setBackgroundResource(R.drawable.table_row_border);  // Fixed border reference

            tableLayout.addView(row);
        }

        btnCancel.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}
