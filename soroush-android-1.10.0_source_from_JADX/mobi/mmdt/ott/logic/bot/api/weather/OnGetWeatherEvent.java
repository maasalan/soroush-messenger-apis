package mobi.mmdt.ott.logic.bot.api.weather;

import mobi.mmdt.ott.logic.bot.api.weather.models.LongTimeWeatherModel;

public class OnGetWeatherEvent {
    private LongTimeWeatherModel model;

    public OnGetWeatherEvent(LongTimeWeatherModel longTimeWeatherModel) {
        this.model = longTimeWeatherModel;
    }

    public LongTimeWeatherModel getModel() {
        return this.model;
    }
}
