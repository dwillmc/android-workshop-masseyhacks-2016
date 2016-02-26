package com.dwillmc.snowstorm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvWeather = (ListView) findViewById(R.id.lvWeather);

        List<Forecast> forecasts = new ArrayList<>();
        forecasts.add(new Forecast("Monday", "Light snow", -1));
        forecasts.add(new Forecast("Tuesday", "Cloudy", 3));
        forecasts.add(new Forecast("Wednesday", "Freezing rain", 0));
        forecasts.add(new Forecast("Thursday", "Rain", 5));
        forecasts.add(new Forecast("Friday", "Rain", 5));
        forecasts.add(new Forecast("Saturday", "Cloudy", 6));
        forecasts.add(new Forecast("Sunday", "Sunny", 7));

        WeatherAdapter adapter = new WeatherAdapter(this, forecasts);
        lvWeather.setAdapter(adapter);
    }

}
