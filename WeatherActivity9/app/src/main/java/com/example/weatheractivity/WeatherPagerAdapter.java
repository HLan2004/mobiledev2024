package com.example.weatheractivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

public class WeatherPagerAdapter extends FragmentPagerAdapter {

    private List<WeatherandBlankFragment> fragmentList;

    public WeatherPagerAdapter(FragmentManager fm, List<WeatherandBlankFragment> fragmentList) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Hanoi";
            case 1:
                return "UK";
            case 2:
                return "Chile";
            default:
                return "Location";
        }
    }
}