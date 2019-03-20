package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewholder> {
    private String[] mWeatherData;

    public class ForecastAdapterViewholder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;

        public ForecastAdapterViewholder(View view) {
            super(view);

            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }

    @NonNull
    @Override
    public ForecastAdapterViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }
}
