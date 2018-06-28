package mobi.mmdt.ott.logic.bot.api.weather.models;

public class DayWeatherModel extends WeatherModel {
    private WeekDay day;
    private long highTemperature;
    private long lowTemperature;

    public DayWeatherModel(WeekDay weekDay, String str, long j, long j2, WeatherCondition weatherCondition) {
        super(str, weatherCondition);
        this.day = weekDay;
        this.lowTemperature = j;
        this.highTemperature = j2;
    }

    public WeekDay getDay() {
        return this.day;
    }

    public long getHighTemperature() {
        return this.highTemperature;
    }

    public long getLowTemperature() {
        return this.lowTemperature;
    }
}
