package mobi.mmdt.ott.logic.bot.api.weather.models;

public class AtmosphereModel {
    private int humidity;
    private double pressure;
    private RisingState risingState;
    private int visibility;

    public AtmosphereModel(int i, int i2, double d, RisingState risingState) {
        this.humidity = i;
        this.visibility = i2;
        this.pressure = d;
        this.risingState = risingState;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public RisingState getRisingState() {
        return this.risingState;
    }

    public int getVisibility() {
        return this.visibility;
    }
}
