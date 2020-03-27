package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterSai extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterSai(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Sai1 sai1 = new Sai1();
                return sai1;
            case 1:
                Sai2 sai2 = new Sai2();
                return sai2;
            case 2:
                Sai3 sai3 = new Sai3();
                return sai3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
