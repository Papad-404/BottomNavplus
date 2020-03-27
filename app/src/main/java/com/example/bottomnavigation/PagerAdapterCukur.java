package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterCukur extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterCukur(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Cukur1 cukur1 = new Cukur1();
                return cukur1;
            case 1:
                Cukur2 cukur2 = new Cukur2();
                return cukur2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
