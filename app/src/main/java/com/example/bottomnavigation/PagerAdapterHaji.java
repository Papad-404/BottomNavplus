package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterHaji extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterHaji(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                Haji1 frag1 = new Haji1();
                return frag1;
            case 1:
                Haji2 frag2 = new Haji2();
                return frag2;
            case 2:
                Haji3 frag3 = new Haji3();
                return frag3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
