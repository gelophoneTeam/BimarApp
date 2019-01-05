package com.example.malizen.bimarapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new Frag_a();
        else if (position == 1) {
            fragment = new Frag_b();}
        else if (position == 2) {
            fragment = new Frag_c();}
        else if (position == 3) {
            fragment = new Frag_d();}

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
