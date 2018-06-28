package mobi.mmdt.ott.logic.bot.api.weather;

import java.util.ArrayList;
import mobi.mmdt.ott.logic.bot.api.C2782a;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.logic.bot.api.weather.models.CurrentWeatherModel;
import mobi.mmdt.ott.logic.bot.api.weather.models.DayWeatherModel;
import mobi.mmdt.ott.logic.bot.api.weather.models.DegreeUnit;
import mobi.mmdt.ott.logic.bot.api.weather.models.LongTimeWeatherModel;
import mobi.mmdt.ott.logic.bot.api.weather.models.WeatherCondition;
import mobi.mmdt.ott.logic.bot.api.weather.models.WeekDay;
import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherBot {
    public static final String BOT_ID = "weatherapi@api.soroush";
    private static final String KEY_ASTRONOMY = "astronomy";
    public static final String KEY_ATMOSPHERE = "atmosphere";
    private static final String KEY_CHILL = "chill";
    private static final String KEY_CITY = "city";
    private static final String KEY_CODE = "code";
    private static final String KEY_CONDITION = "condition";
    private static final String KEY_CONVENTION = "convention";
    private static final String KEY_COUNTRY = "country";
    private static final String KEY_DATE = "date";
    private static final String KEY_DAY = "day";
    private static final String KEY_DEGREE_UNIT = "degreeUnit";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_DISTANCE = "distance";
    private static final String KEY_FORECASTS = "forecasts";
    private static final String KEY_GEOLAT = "geoLat";
    private static final String KEY_GEOLONG = "geoLong";
    private static final String KEY_GUID = "guid";
    private static final String KEY_HEIGHT = "height";
    private static final String KEY_HIGH = "high";
    private static final String KEY_HOURS = "hours";
    private static final String KEY_HUMIDITY = "humidity";
    private static final String KEY_IMAGE = "image";
    public static final String KEY_ITEM = "item";
    private static final String KEY_LANGUAGE = "language";
    private static final String KEY_LASTBUILDDATE = "lastBuildDate";
    private static final String KEY_LINK = "link";
    private static final String KEY_LOCATION = "location";
    private static final String KEY_LOW = "low";
    private static final String KEY_MINUTES = "minutes";
    private static final String KEY_PRESSURE = "pressure";
    private static final String KEY_PUBDATE = "pubDate";
    private static final String KEY_REGION = "region";
    private static final String KEY_RISING = "rising";
    private static final String KEY_SPEED = "speed";
    private static final String KEY_SUNRISE = "sunrise";
    private static final String KEY_SUNSET = "sunset";
    private static final String KEY_TEMP = "temp";
    private static final String KEY_TEMPERATURE = "temperature";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TTL = "ttl";
    private static final String KEY_UNITS = "units";
    private static final String KEY_URL = "url";
    private static final String KEY_VISIBILITY = "visibility";
    private static final String KEY_WIDTH = "width";
    public static final String KEY_WIND = "wind";
    private static final String METHOD_GET_WEATHER_BY_CITY = "GET_WEATHER_BY_CITY";
    private static final String METHOD_GET_WEATHER_BY_LOCATION = "GET_WEATHER_BY_LOCATION";
    private static final String METHOD_GET_WEATHER_BY_NAME = "GET_WEATHER_BY_NAME";
    private static final String SERVICE_TYPE = "GET_WEATHER";

    private static CurrentWeatherModel getCurrentWeatherModel(JSONObject jSONObject) {
        return new CurrentWeatherModel(jSONObject.getString(KEY_DATE), jSONObject.getLong(KEY_TEMP), WeatherCondition.getWeatherCondition(jSONObject.getInt("code")));
    }

    private static DayWeatherModel getDayModel(JSONObject jSONObject) {
        return new DayWeatherModel(WeekDay.valueOf(jSONObject.getString(KEY_DAY)), jSONObject.getString(KEY_DATE), jSONObject.getLong(KEY_LOW), jSONObject.getLong(KEY_HIGH), WeatherCondition.getWeatherCondition(jSONObject.getInt("code")));
    }

    private static int getHumidity(JSONObject jSONObject) {
        return jSONObject.getInt(KEY_HUMIDITY);
    }

    private static int getSpeed(JSONObject jSONObject) {
        return jSONObject.getInt(KEY_SPEED);
    }

    static void getWeatherByCityModel(String str, C2780b c2780b, DegreeUnit degreeUnit) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("methodType", METHOD_GET_WEATHER_BY_CITY);
        jSONObject.put(KEY_DEGREE_UNIT, degreeUnit.name());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("persianName", c2780b.f8789a);
        jSONObject2.put("englishName", c2780b.f8790b);
        jSONObject2.put("provincePersianName", c2780b.f8791c);
        jSONObject2.put("provinceEnglishName", c2780b.f8792d);
        jSONObject.put(KEY_CITY, jSONObject2);
        C2782a.m7096a(BOT_ID, jSONObject, str);
    }

    static void getWeatherByGeo(String str, double d, double d2, DegreeUnit degreeUnit) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("methodType", METHOD_GET_WEATHER_BY_LOCATION);
        jSONObject.put("latitude", d);
        jSONObject.put("longitude", d2);
        jSONObject.put(KEY_DEGREE_UNIT, degreeUnit.name());
        C2782a.m7096a(BOT_ID, jSONObject, str);
    }

    static void getWeatherByName(String str, String str2, DegreeUnit degreeUnit) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("methodType", METHOD_GET_WEATHER_BY_NAME);
        jSONObject.put("cityName", str2);
        jSONObject.put(KEY_DEGREE_UNIT, degreeUnit.name());
        C2782a.m7096a(BOT_ID, jSONObject, str);
    }

    static LongTimeWeatherModel receiveWeatherData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        CurrentWeatherModel currentWeatherModel = getCurrentWeatherModel(jSONObject.getJSONObject("condition"));
        int speed = getSpeed(jSONObject2);
        int humidity = getHumidity(jSONObject3);
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_FORECASTS);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(getDayModel(jSONArray.getJSONObject(i)));
        }
        return new LongTimeWeatherModel(currentWeatherModel, arrayList, speed, humidity);
    }
}
