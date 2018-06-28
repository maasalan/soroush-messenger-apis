package mobi.mmdt.ott.logic.bot.api.weather;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.bot.api.weather.models.DegreeUnit;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public class GetWeatherByGeoJob extends C5891a {
    private DegreeUnit degreeUnit;
    private double latitude;
    private double longitude;

    public GetWeatherByGeoJob(double d, double d2, DegreeUnit degreeUnit) {
        super(C2683h.f8620b);
        this.latitude = d;
        this.longitude = d2;
        this.degreeUnit = degreeUnit;
    }

    public void onAdded() {
    }

    protected void onCancel(int i, Throwable th) {
    }

    public void onRun() {
        WeatherBot.getWeatherByGeo(C2483a.m6744a(MyApplication.m12952b()), this.latitude, this.longitude, this.degreeUnit);
    }

    protected C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
