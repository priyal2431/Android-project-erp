package com.example.rku_ierpac_system;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AttendancePagerAdapter extends FragmentStateAdapter {

    public AttendancePagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new MonthWiseFragment();
        } else {
            return new SubjectWiseFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

