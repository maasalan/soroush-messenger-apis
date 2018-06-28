package mobi.mmdt.ott.logic.bot.api.weather;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import org.json.JSONArray;
import p000a.p001a.p002a.C0005c;

public class ProcessWeatherResultJob extends C5891a {
    private String message;
    private String packetId;

    public ProcessWeatherResultJob(String str, String str2) {
        super(C2683h.f8620b);
        this.message = str;
        this.packetId = str2;
    }

    public void onAdded() {
    }

    protected void onCancel(int i, Throwable th) {
    }

    public void onRun() {
        JSONArray jSONArray = new JSONArray(this.message);
        C0005c.m0a().m9d(new OnGetWeatherEvent(WeatherBot.receiveWeatherData(jSONArray.getJSONObject(0).getJSONObject("item"), jSONArray.getJSONObject(0).getJSONObject(WeatherBot.KEY_WIND), jSONArray.getJSONObject(0).getJSONObject(WeatherBot.KEY_ATMOSPHERE))));
    }

    protected C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
