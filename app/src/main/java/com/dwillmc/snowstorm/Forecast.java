package com.dwillmc.snowstorm;

public class Forecast {

    private String day;
    private String weather;
    private int degrees;

    public Forecast(String day, String weather, int degrees) {
        this.day = day;
        this.weather = weather;
        this.degrees = degrees;
    }

    public String getDay() {
        return day;
    }

    public String getWeather() {
        return weather;
    }

    public int getDegrees() {
        return degrees;
    }

}
