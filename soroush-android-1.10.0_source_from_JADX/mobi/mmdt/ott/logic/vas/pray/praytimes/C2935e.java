package mobi.mmdt.ott.logic.vas.pray.praytimes;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2919b;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2930a.C2927a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2930a.C2928b;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2930a.C2929c;

public final class C2935e {
    private static Map<C2920c, Double> f9145a;
    private final C2932c f9146b;
    private final C2932c f9147c;
    private final int f9148d;
    private final int f9149e;
    private final C2930a f9150f;
    private boolean f9151g;
    private double f9152h;
    private double f9153i;
    private C2919b f9154j;

    private class C2934a {
        final double f9142a;
        final double f9143b;
        final /* synthetic */ C2935e f9144c;

        public C2934a(C2935e c2935e, double d, double d2) {
            this.f9144c = c2935e;
            this.f9142a = d;
            this.f9143b = d2;
        }
    }

    static {
        Map hashMap = new HashMap();
        f9145a = hashMap;
        hashMap.put(C2920c.MorningPray, Double.valueOf(0.20833333333333334d));
        f9145a.put(C2920c.Sunrise, Double.valueOf(0.25d));
        f9145a.put(C2920c.NoonPray, Double.valueOf(0.5d));
        f9145a.put(C2920c.Sunset, Double.valueOf(0.75d));
        f9145a.put(C2920c.EveningPray, Double.valueOf(0.75d));
        f9145a = Collections.unmodifiableMap(f9145a);
    }

    public C2935e() {
        this(C2930a.MWL);
    }

    public C2935e(C2930a c2930a) {
        this.f9146b = C2936f.m7327a(10);
        this.f9147c = C2936f.m7327a(0);
        this.f9148d = C2927a.f9109a;
        this.f9149e = C2928b.f9112a;
        this.f9150f = c2930a;
    }

    private double m7319a(double d) {
        return C2936f.m7330d(12.0d - m7324b(this.f9153i + d).f9143b);
    }

    private double m7320a(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f9149e == C2928b.f9113b ? 0.016666666666666666d * d3 : 0.5d;
        if (this.f9149e == C2928b.f9114c) {
            d5 = 0.0d;
        }
        d5 *= d4;
        d3 = C2936f.m7330d(z ? d2 - d : d - d2);
        if (!Double.isNaN(d) && d3 <= d5) {
            return d;
        }
        if (z) {
            d5 = -d5;
        }
        return d2 + d5;
    }

    private double m7321a(C2932c c2932c, double d, boolean z) {
        double d2 = m7324b(this.f9153i + d).f9142a;
        d = C2936f.m7326a(m7319a(d));
        d2 = Math.acos(((-Math.sin(C2936f.m7326a(c2932c.f9137b))) - (Math.sin(d2) * Math.sin(C2936f.m7326a(this.f9154j.f9089a)))) / (Math.cos(d2) * Math.cos(C2936f.m7326a(this.f9154j.f9089a)))) / 15.0d;
        if (z) {
            d2 = -d2;
        }
        return C2936f.m7328b(d + d2);
    }

    private Map<C2920c, Double> m7322a(Map<C2920c, Double> map) {
        C2935e c2935e = this;
        Map<C2920c, Double> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Double.valueOf((((Double) entry.getValue()).doubleValue() + c2935e.f9152h) - (c2935e.f9154j.f9090b / 15.0d)));
        }
        if (c2935e.f9149e != C2928b.f9115d) {
            double d = C2936f.m7330d(((Double) hashMap.get(C2920c.Sunrise)).doubleValue() - ((Double) hashMap.get(C2920c.Sunset)).doubleValue());
            double d2 = d;
            hashMap.put(C2920c.MorningPray, Double.valueOf(m7320a(((Double) hashMap.get(C2920c.MorningPray)).doubleValue(), ((Double) hashMap.get(C2920c.Sunrise)).doubleValue(), c2935e.f9150f.f9128h.f9137b, d2, true)));
            hashMap.put(C2920c.EveningPray, Double.valueOf(m7320a(((Double) hashMap.get(C2920c.EveningPray)).doubleValue(), ((Double) hashMap.get(C2920c.Sunset)).doubleValue(), c2935e.f9150f.f9129i.f9137b, d2, false)));
        }
        if (c2935e.f9150f.f9129i.f9136a) {
            hashMap.put(C2920c.EveningPray, Double.valueOf(((Double) hashMap.get(C2920c.Sunset)).doubleValue() + (c2935e.f9150f.f9129i.f9137b / 60.0d)));
        }
        hashMap.put(C2920c.NoonPray, Double.valueOf(((Double) hashMap.get(C2920c.NoonPray)).doubleValue() + (c2935e.f9147c.f9137b / 60.0d)));
        return hashMap;
    }

    private C2932c m7323a() {
        return C2936f.m7329c(0.833d + (0.0347d * Math.sqrt(this.f9154j.f9091c)));
    }

    private C2934a m7324b(double d) {
        double d2 = d - 2451545.0d;
        double d3 = (357.529d + (0.98560028d * d2)) % 360.0d;
        double d4 = (280.459d + (0.98564736d * d2)) % 360.0d;
        double sin = (((1.915d * Math.sin(C2936f.m7326a(d3))) + d4) + (0.02d * Math.sin(C2936f.m7326a(2.0d * d3)))) % 360.0d;
        d2 = 23.439d - (3.6E-7d * d2);
        return new C2934a(this, Math.asin(Math.sin(C2936f.m7326a(d2)) * Math.sin(C2936f.m7326a(sin))), (d4 / 15.0d) - C2936f.m7330d(C2936f.m7328b(Math.atan2(Math.cos(C2936f.m7326a(d2)) * Math.sin(C2936f.m7326a(sin)), Math.cos(C2936f.m7326a(sin)))) / 15.0d));
    }

    public final Map<C2920c, C2931b> m7325a(Date date, C2919b c2919b) {
        double doubleValue;
        double doubleValue2;
        Object obj;
        this.f9154j = c2919b;
        this.f9152h = ((double) TimeZone.getDefault().getRawOffset()) / 3600000.0d;
        this.f9151g = TimeZone.getDefault().inDaylightTime(date);
        if (this.f9151g) {
            this.f9152h += 1.0d;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        if (i2 <= 2) {
            i--;
            i2 += 12;
        }
        double floor = Math.floor(((double) i) / 100.0d);
        this.f9153i = ((((Math.floor(365.25d * ((double) (i + 4716))) + Math.floor(30.6001d * ((double) (i2 + 1)))) + ((double) i3)) + ((2.0d - floor) + Math.floor(floor / 4.0d))) - 1524.5d) - (this.f9154j.f9090b / 360.0d);
        Map hashMap = new HashMap();
        hashMap.put(C2920c.MorningPray, Double.valueOf(m7321a(this.f9150f.f9128h, ((Double) f9145a.get(C2920c.MorningPray)).doubleValue(), true)));
        hashMap.put(C2920c.Sunrise, Double.valueOf(m7321a(m7323a(), ((Double) f9145a.get(C2920c.Sunrise)).doubleValue(), true)));
        hashMap.put(C2920c.NoonPray, Double.valueOf(m7319a(((Double) f9145a.get(C2920c.NoonPray)).doubleValue())));
        hashMap.put(C2920c.Sunset, Double.valueOf(m7321a(m7323a(), ((Double) f9145a.get(C2920c.Sunset)).doubleValue(), false)));
        hashMap.put(C2920c.EveningPray, Double.valueOf(m7321a(this.f9150f.f9129i, ((Double) f9145a.get(C2920c.EveningPray)).doubleValue(), false)));
        Map a = m7322a(hashMap);
        C2920c c2920c = C2920c.MidNight;
        if (this.f9150f.f9130j == C2929c.f9118b) {
            doubleValue = ((Double) a.get(C2920c.Sunset)).doubleValue();
            doubleValue2 = ((Double) a.get(C2920c.Sunset)).doubleValue();
            obj = C2920c.MorningPray;
        } else {
            doubleValue = ((Double) a.get(C2920c.Sunset)).doubleValue();
            doubleValue2 = ((Double) a.get(C2920c.Sunset)).doubleValue();
            obj = C2920c.Sunrise;
        }
        a.put(c2920c, Double.valueOf(doubleValue + (C2936f.m7330d(((Double) a.get(obj)).doubleValue() - doubleValue2) / 2.0d)));
        Map<C2920c, C2931b> hashMap2 = new HashMap();
        for (Entry entry : a.entrySet()) {
            Object key = entry.getKey();
            doubleValue2 = C2936f.m7330d(((Double) entry.getValue()).doubleValue() + 0.008333333333333333d);
            i = (int) doubleValue2;
            hashMap2.put(key, new C2931b(i, (int) ((doubleValue2 - ((double) i)) * 60.0d)));
        }
        return hashMap2;
    }
}
