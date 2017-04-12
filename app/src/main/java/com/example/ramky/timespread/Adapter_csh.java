package com.example.ramky.timespread;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adapter_csh extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Adapter_csh(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Mon_c tab1 = new Mon_c();
                return tab1;
            case 1:
                Tue_c tab2 = new Tue_c();
                return tab2;
            case 2:
                Wed_c tab3 = new Wed_c();
                return tab3;
            case 3:
                Thu_c tab4 = new Thu_c();
                return tab4;
            case 4:
                Fri_c tab5 = new Fri_c();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}