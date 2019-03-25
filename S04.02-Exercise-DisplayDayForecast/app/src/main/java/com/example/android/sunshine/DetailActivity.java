package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private String mWeatherDetail;
    private TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_detail_display);

        Intent initializer = getIntent();

        if (initializer != null && initializer.hasExtra(Intent.EXTRA_TEXT)) {
            mWeatherDetail = initializer.getStringExtra(Intent.EXTRA_TEXT);
            mWeatherDisplay.setText(mWeatherDetail);
        }

        // Completed (2) Display the weather forecast that was passed from MainActivity
    }
}