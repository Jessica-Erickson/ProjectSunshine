package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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

    @Override
    public ForecastAdapterViewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int listItemId = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachImmediately = false;
        View view = inflater.inflate(listItemId, viewGroup, shouldAttachImmediately);

        return new ForecastAdapterViewholder(view);
    }
}
