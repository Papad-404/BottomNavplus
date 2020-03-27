package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterThawaf extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterThawaf(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Thawaf1 thawaf1 = new Thawaf1();
                return thawaf1;
            case 1:
                Thawaf2 thawaf2 = new Thawaf2();
                return thawaf2;
            case 2:
                Thawaf3 thawaf3 = new Thawaf3();
                return thawaf3;
            case 3:
                Thawaf4 thawaf4 = new Thawaf4();
                return thawaf4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
