package com.example.weatheractivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;



public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ViewPager viewPager = findViewById(R.id.viewPager);
        List<WeatherandBlankFragment> fragmentList = new ArrayList<>();

        fragmentList.add(WeatherandBlankFragment.newInstance("Location1", "Data1"));
        fragmentList.add(WeatherandBlankFragment.newInstance("Location2", "Data2"));
        fragmentList.add(WeatherandBlankFragment.newInstance("Location3", "Data3"));

        WeatherPagerAdapter adapter = new WeatherPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);



        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        Log.i(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy called");
    }
}
