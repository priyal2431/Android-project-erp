package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class selectrole extends AppCompatActivity {

    Button faculty, student;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Use the correct layout file
        setContentView(R.layout.activity_selectrole);

        faculty = findViewById(R.id.btnFaculty);
        student = findViewById(R.id.btnStudent);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(selectrole.this, dashboardst.class);
                startActivity(in);
            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(selectrole.this, dashboard_faculty.class);
                startActivity(in);
            }
        });
    }
}
