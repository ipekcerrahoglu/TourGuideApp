package com.example.lenovo.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DivingFragment();
        } else if (position == 1) {
            return new ParaglidingFragment();
        } else if (position == 2) {
            return new AntiphellosFragment();
        } else {
            return new MeisFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_diving);
        } else if (position == 1) {
            return context.getString(R.string.category_paragliding);
        } else if (position == 2) {
            return context.getString(R.string.category_antiphellos);
        } else {
            return context.getString(R.string.category_meis);
        }
    }
}
