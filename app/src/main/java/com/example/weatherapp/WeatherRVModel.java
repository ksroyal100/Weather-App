package com.example.weatherapp;

public class WeatherRVModel {
    private String time;
    private String Temperature;
    private String icon;
    private String windSpeed;

    public WeatherRVModel(String time, String temperature, String icon, String windSpeed) {
        this.time = time;
        Temperature = temperature;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
