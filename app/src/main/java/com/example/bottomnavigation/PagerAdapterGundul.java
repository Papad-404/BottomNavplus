package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterGundul extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterGundul(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Gundul1 gundul1 = new Gundul1();
                return gundul1;
            case 1:
                Gundul2 gundul2 = new Gundul2();
                return gundul2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
