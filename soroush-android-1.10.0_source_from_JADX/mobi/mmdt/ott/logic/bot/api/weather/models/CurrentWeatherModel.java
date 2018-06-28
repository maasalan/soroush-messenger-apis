package mobi.mmdt.ott.logic.bot.api.weather.models;

public class CurrentWeatherModel extends WeatherModel {
    private long temperature;

    public CurrentWeatherModel(String str, long j, WeatherCondition weatherCondition) {
        super(str, weatherCondition);
        this.temperature = j;
    }

    public long getTemperature() {
        return this.temperature;
    }
}
