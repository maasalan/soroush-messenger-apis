package mobi.mmdt.ott.logic.vas.p374b;

import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.bot.api.weather.models.WeatherCondition;

public final class C2915a {
    public static int m7293a(WeatherCondition weatherCondition) {
        switch (weatherCondition) {
            case tornado:
            case tropical_storm:
            case severe_thunderstorms:
            case thunderstorms:
                return R.drawable.ic_weather_11n;
            case blowing_snow:
                return R.drawable.ic_weather_09n;
            case blustery:
                return R.drawable.ic_weather_04d;
            case clear_night:
                return R.drawable.ic_weather_01n;
            case cloudy:
                return R.drawable.ic_weather_03d;
            case cold:
                return R.drawable.ic_weather_04d;
            case drizzle:
                return R.drawable.ic_weather_09n;
            case dust:
                return R.drawable.ic_weather_50n;
            case fair_day:
                return R.drawable.ic_weather_01d;
            case fair_night:
                return R.drawable.ic_weather_01n;
            case foggy:
                return R.drawable.ic_weather_50n;
            case freezing_drizzle:
            case freezing_rain:
            case hail:
            case snow_flurries:
                return R.drawable.ic_weather_13d;
            case haze:
                return R.drawable.ic_weather_50n;
            case heavy_snow:
            case snow:
                return R.drawable.ic_weather_13d;
            case windy:
                return R.drawable.ic_weather_03d;
            case partly_cloudy:
            case partly_cloudy_day:
                return R.drawable.ic_weather_02d;
            case partly_cloudy_night:
                return R.drawable.ic_weather_02n;
            case scattered_showers:
                return R.drawable.ic_weather_03d;
            case scattered_snow_showers:
                return R.drawable.ic_weather_13d;
            case scattered_thunderstorms:
            case scattered_thunderstorms2:
                return R.drawable.ic_weather_11n;
            case smoky:
                return R.drawable.ic_weather_50n;
            case sunny:
                return R.drawable.ic_weather_01d;
            case thundershowers:
                return R.drawable.ic_weather_11n;
            case snow_showers:
                return R.drawable.ic_weather_13d;
            case sleet:
                return R.drawable.ic_weather_09n;
            case heavy_snow2:
                return R.drawable.ic_weather_13d;
            case hot:
                return R.drawable.ic_weather_01d;
            case hurricane:
                return R.drawable.ic_weather_50n;
            case isolated_thundershowers:
            case isolated_thunderstorms:
                return R.drawable.ic_weather_11n;
            case light_snow_showers:
                return R.drawable.ic_weather_13d;
            case showers:
            case showers2:
            case mixed_rain_and_hail:
                return R.drawable.ic_weather_09n;
            case mixed_rain_and_sleet:
                return R.drawable.ic_weather_10d;
            case mixed_rain_and_snow:
            case mixed_snow_and_sleet:
                return R.drawable.ic_weather_13d;
            case mostly_cloudy_day:
                return R.drawable.ic_weather_02d;
            case mostly_cloudy_night:
                return R.drawable.ic_weather_02n;
            default:
                return R.drawable.ic_weather_01d;
        }
    }
}
