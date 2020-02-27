package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Captain Z on 2020/2/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
