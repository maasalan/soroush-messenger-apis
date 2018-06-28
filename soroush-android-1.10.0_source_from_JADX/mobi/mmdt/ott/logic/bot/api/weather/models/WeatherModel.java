package mobi.mmdt.ott.logic.bot.api.weather.models;

public class WeatherModel {
    private String date;
    private WeatherCondition weatherCondition;

    public WeatherModel(String str, WeatherCondition weatherCondition) {
        this.date = str;
        this.weatherCondition = weatherCondition;
    }

    public String getDate() {
        return this.date;
    }

    public WeatherCondition getWeatherCondition() {
        return this.weatherCondition;
    }
}
