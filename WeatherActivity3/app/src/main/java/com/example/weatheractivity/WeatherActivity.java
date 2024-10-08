package com.example.weatheractivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.app.Fragment;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BlankFragment forecastFragment= new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, forecastFragment).commit();

        BlankFragment backgroundFragment= new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, backgroundFragment).commit();
        setContentView(R.layout.activity_weather);
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
