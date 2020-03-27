package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterZamzam extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterZamzam(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Zamzam1 zamzam1 = new Zamzam1();
                return zamzam1;
            case 1:
                Zamzam2 zamzam2 = new Zamzam2();
                return zamzam2;
            case 2:
                Zamzam3 zamzam3 = new Zamzam3();
                return zamzam3;
            case 3:
                Zamzam4 zamzam4 = new Zamzam4();
                return zamzam4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
