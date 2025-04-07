package com.example.rku_ierpac_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Time_Table_Student extends AppCompatActivity {
    private TextView dayNameText;
    ImageView TimeTable_back_icon;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_student);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);
//        dayNameText = findViewById(R.id.dayNameText);

        TimeTable_back_icon = findViewById(R.id.TimeTable_back_icon);

        TimetablePagerAdapter adapter = new TimetablePagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            tab.setText(days[position]);
        }).attach();

//        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//                dayNameText.setText(days[position]);
//            }
//        });

        TimeTable_back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Time_Table_Student.this, dashboardst.class);
                startActivity(in);
            }
        });


    }
}
