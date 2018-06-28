package mobi.mmdt.ott.logic.bot.api.weather.models;

public enum WeatherCondition {
    tornado(0, "tornado"),
    tropical_storm(1, "tropical storm"),
    hurricane(2, "hurricane"),
    severe_thunderstorms(3, "severe thunderstorms"),
    thunderstorms(4, "thunderstorms"),
    mixed_rain_and_snow(5, "mixed rain and snow"),
    mixed_rain_and_sleet(6, "mixed rain and sleet"),
    mixed_snow_and_sleet(7, "mixed snow and sleet"),
    freezing_drizzle(8, "freezing drizzle"),
    drizzle(9, "drizzle"),
    freezing_rain(10, "freezing rain"),
    showers(11, "showers"),
    showers2(12, "showers"),
    snow_flurries(13, "snow flurries"),
    light_snow_showers(14, "light snow showers"),
    blowing_snow(15, "blowing snow"),
    snow(16, "snow"),
    hail(17, "hail"),
    sleet(18, "sleet"),
    dust(19, "dust"),
    foggy(20, "foggy"),
    haze(21, "haze"),
    smoky(22, "smoky"),
    blustery(23, "blustery"),
    windy(24, "windy"),
    cold(25, "cold"),
    cloudy(26, "cloudy"),
    mostly_cloudy_night(27, "mostly cloudy (night)"),
    mostly_cloudy_day(28, "mostly cloudy (day)"),
    partly_cloudy_night(29, "partly cloudy (night)"),
    partly_cloudy_day(30, "partly cloudy (day)"),
    clear_night(31, "clear (night)"),
    sunny(32, "sunny"),
    fair_night(33, "fair (night)"),
    fair_day(34, "fair (day)"),
    mixed_rain_and_hail(35, "mixed rain and hail"),
    hot(36, "hot"),
    isolated_thunderstorms(37, "isolated thunderstorms"),
    scattered_thunderstorms(38, "scattered thunderstorms"),
    scattered_thunderstorms2(39, "scattered thunderstorms"),
    scattered_showers(40, "scattered showers"),
    heavy_snow(41, "heavy snow"),
    scattered_snow_showers(42, "scattered snow showers"),
    heavy_snow2(43, "heavy snow"),
    partly_cloudy(44, "partly cloudy"),
    thundershowers(45, "thundershowers"),
    snow_showers(46, "snow showers"),
    isolated_thundershowers(47, "isolated thundershowers"),
    not_available(3200, "not available");
    
    private int conditionCode;
    private String conditionString;

    private WeatherCondition(int i, String str) {
        this.conditionCode = i;
        this.conditionString = str;
    }

    public static WeatherCondition getWeatherCondition(int i) {
        for (WeatherCondition weatherCondition : values()) {
            if (i == weatherCondition.getConditionCode()) {
                return weatherCondition;
            }
        }
        return null;
    }

    public final int getConditionCode() {
        return this.conditionCode;
    }

    public final String getConditionString() {
        return this.conditionString;
    }
}
