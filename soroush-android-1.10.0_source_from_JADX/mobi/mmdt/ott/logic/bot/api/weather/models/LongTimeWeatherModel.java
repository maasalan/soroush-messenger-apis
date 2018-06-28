package mobi.mmdt.ott.logic.bot.api.weather.models;

import java.util.ArrayList;

public class LongTimeWeatherModel {
    private CurrentWeatherModel current;
    private int humidity;
    private ArrayList<DayWeatherModel> weatherModels = new ArrayList();
    private int windSpeed;

    public LongTimeWeatherModel(CurrentWeatherModel currentWeatherModel, ArrayList<DayWeatherModel> arrayList, int i, int i2) {
        this.current = currentWeatherModel;
        this.weatherModels = arrayList;
        this.windSpeed = i;
        this.humidity = i2;
    }

    public CurrentWeatherModel getCurrent() {
        return this.current;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public ArrayList<DayWeatherModel> getWeatherModels() {
        return this.weatherModels;
    }

    public int getWindSpeed() {
        return this.windSpeed;
    }
}
