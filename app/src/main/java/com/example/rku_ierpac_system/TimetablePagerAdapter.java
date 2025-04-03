package com.example.rku_ierpac_system;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TimetablePagerAdapter extends FragmentStateAdapter {
    public TimetablePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new MondayFragment();
            case 1: return new TuesdayFragment();
            case 2: return new WednesdayFragment();
            case 3: return new ThursdayFragment();
            case 4: return new FridayFragment();
            default: return new MondayFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5; // 5 Days (Monday - Friday)
    }
}
