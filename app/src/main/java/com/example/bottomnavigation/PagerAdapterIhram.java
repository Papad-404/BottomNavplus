package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterIhram extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterIhram(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FiqihUmrahIhram frag1 = new FiqihUmrahIhram();
                return frag1;
            case 1:
                FiqihUmrahIhramMiqot frag2 = new FiqihUmrahIhramMiqot();
                return frag2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
