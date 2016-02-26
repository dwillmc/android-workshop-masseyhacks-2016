package com.dwillmc.snowstorm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {

    private Context context;
    private List<Forecast> forecastList;

    public WeatherAdapter(Context context, List<Forecast> forecastList) {
        this.context = context;
        this.forecastList = forecastList;
    }

    @Override
    public int getCount() {
        return forecastList.size();
    }

    @Override
    public Forecast getItem(int position) {
        return forecastList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_day_forecast, null);

        Forecast forecast = getItem(position);

        TextView tvDay = (TextView) view.findViewById(R.id.tvDay);
        TextView tvWeather = (TextView) view.findViewById(R.id.tvWeather);
        TextView tvDegrees = (TextView) view.findViewById(R.id.tvDegrees);

        String day = forecast.getDay();
        tvDay.setText(day);
        String weather = forecast.getWeather();
        tvWeather.setText(weather);
        int degreeInt = forecast.getDegrees();
        String degrees = String.valueOf(degreeInt) + (char) 0x00B0;
        tvDegrees.setText(degrees);

        return view;
    }

}
