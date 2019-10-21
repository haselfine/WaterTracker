package com.example.water;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WaterViewPagerAdapter extends FragmentPagerAdapter {

    private String[] days;

    public WaterViewPagerAdapter(FragmentManager fm, String[] days){ //adapts data into the fragment manager
        super(fm);
        this.days = days;
    }

    @Override
    public Fragment getItem(int position){ //retrieves row of data
        return WaterFragment.newInstance(days[position]);
    }

    @Override
    public int getCount(){ //retrieves amount of days
        return days.length;
    }
}
