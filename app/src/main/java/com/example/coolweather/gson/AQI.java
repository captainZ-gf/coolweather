package com.example.coolweather.gson;

/**
 * Created by Captain Z on 2020/2/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
