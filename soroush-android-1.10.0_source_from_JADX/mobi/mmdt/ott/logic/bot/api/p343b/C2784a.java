package mobi.mmdt.ott.logic.bot.api.p343b;

import android.os.Build.VERSION;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import org.json.JSONObject;

public class C2784a {
    public static String f8795a = "DEVICE_ID";
    public static String f8796b = "APP_VERSION";
    public static String f8797c = "OS_VERSION";
    public static String f8798d = "OS";
    public static String f8799e = "DATA";
    public static String f8800f = "REPORT_NAME";
    protected JSONObject f8801g = new JSONObject();
    private String f8802h;
    private String f8803i;
    private String f8804j;
    private String f8805k;
    private String f8806l;

    protected C2784a(String str) {
        this.f8806l = str;
        this.f8802h = "";
        try {
            this.f8802h = C2492j.m6842b(MyApplication.m12952b());
        } catch (Throwable e) {
            C2480b.m6737b("problem in getting deviceId", e);
        }
        this.f8803i = "android";
        this.f8804j = VERSION.RELEASE;
        this.f8805k = C2492j.m6845d(MyApplication.m12952b());
    }

    public final JSONObject m7097a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f8795a, this.f8802h);
        jSONObject.put(f8796b, this.f8805k);
        jSONObject.put(f8797c, this.f8804j);
        jSONObject.put(f8798d, this.f8803i);
        jSONObject.put(f8800f, this.f8806l);
        jSONObject.put(f8799e, this.f8801g);
        return jSONObject;
    }
}
