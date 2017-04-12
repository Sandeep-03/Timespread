package com.example.ramky.timespread;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adapter_B extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Adapter_B(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Mon2fri_FB tab1 = new Mon2fri_FB();
                return tab1;
            case 1:
                 Holidays_FB tab2 = new Holidays_FB();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}