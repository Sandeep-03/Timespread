package com.example.ramky.timespread;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Adapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Mon_fm tab1 = new Mon_fm();
                return tab1;
            case 1:
                Tue_fm tab2 = new Tue_fm();
                return tab2;
            case 2:
                Wed_fm tab3 = new Wed_fm();
                return tab3;
            case 3:
                Thu_fm tab4 = new Thu_fm();
                return tab4;
            case 4:
                Fri_fm tab5 = new Fri_fm();
                return tab5;
            case 5:
                Sat_fm tab6 = new Sat_fm();
                return tab6;
            case 6:
                Sun_fm tab7 = new Sun_fm();
                return tab7;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}