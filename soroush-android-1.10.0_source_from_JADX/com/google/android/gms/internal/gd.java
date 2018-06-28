package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.math.BigInteger;
import java.util.Locale;
import org.jivesoftware.smack.util.StringUtils;

final class gd extends hq {
    static final Pair<String, Long> f18146a = new Pair("", Long.valueOf(0));
    public final gg f18147b = new gg(this, "health_monitor", Math.max(0, ((Long) fj.f5764e.f5786a).longValue()));
    public final gf f18148c = new gf(this, "last_upload", 0);
    public final gf f18149d = new gf(this, "last_upload_attempt", 0);
    public final gf f18150e = new gf(this, "backoff", 0);
    public final gf f18151f = new gf(this, "last_delete_stale", 0);
    public final gf f18152g = new gf(this, "midnight_offset", 0);
    public final gf f18153h = new gf(this, "first_open_time", 0);
    public final gh f18154i = new gh(this, "app_instance_id");
    String f18155j;
    long f18156k;
    final Object f18157l = new Object();
    public final gf f18158m = new gf(this, "time_before_start", 10000);
    public final gf f18159n = new gf(this, "session_timeout", 1800000);
    public final ge f18160o = new ge(this, "start_new_session");
    public final gf f18161p = new gf(this, "last_pause_time", 0);
    public final gf f18162q = new gf(this, "time_active", 0);
    public boolean f18163r;
    private SharedPreferences f18164t;
    private String f18165u;
    private boolean f18166v;
    private long f18167w;

    gd(gr grVar) {
        super(grVar);
    }

    private final SharedPreferences m16276D() {
        mo1606c();
        m11975L();
        return this.f18164t;
    }

    final Boolean m16278A() {
        mo1606c();
        return !m16276D().contains("use_service") ? null : Boolean.valueOf(m16276D().getBoolean("use_service", false));
    }

    final void m16279B() {
        mo1606c();
        mo1623t().f18140g.m4846a("Clearing collection preferences.");
        boolean contains = m16276D().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = m16286c(true);
        }
        Editor edit = m16276D().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            m16284b(z);
        }
    }

    protected final String m16280C() {
        mo1606c();
        String string = m16276D().getString("previous_os_version", null);
        mo1611h().m11975L();
        String str = VERSION.RELEASE;
        if (!(TextUtils.isEmpty(str) || str.equals(string))) {
            Editor edit = m16276D().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    final Pair<String, Boolean> m16281a(String str) {
        mo1606c();
        long b = mo1614k().mo1576b();
        if (this.f18165u != null && b < this.f18167w) {
            return new Pair(this.f18165u, Boolean.valueOf(this.f18166v));
        }
        this.f18167w = b + mo1625v().m11919a(str, fj.f5763d);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo1615l());
            if (advertisingIdInfo != null) {
                this.f18165u = advertisingIdInfo.getId();
                this.f18166v = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f18165u == null) {
                this.f18165u = "";
            }
        } catch (Throwable th) {
            mo1623t().f18139f.m4847a("Unable to get advertising id", th);
            this.f18165u = "";
        }
        return new Pair(this.f18165u, Boolean.valueOf(this.f18166v));
    }

    final void m16282a(boolean z) {
        mo1606c();
        mo1623t().f18140g.m4847a("Setting useService", Boolean.valueOf(z));
        Editor edit = m16276D().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    final String m16283b(String str) {
        mo1606c();
        str = (String) m16281a(str).first;
        if (ju.m16583f(StringUtils.MD5) == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, ju.m16583f(StringUtils.MD5).digest(str.getBytes()))});
    }

    final void m16284b(boolean z) {
        mo1606c();
        mo1623t().f18140g.m4847a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m16276D().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    final void m16285c(String str) {
        mo1606c();
        Editor edit = m16276D().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    final boolean m16286c(boolean z) {
        mo1606c();
        return m16276D().getBoolean("measurement_enabled", z);
    }

    protected final void d_() {
        this.f18164t = mo1615l().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f18163r = this.f18164t.getBoolean("has_been_opened", false);
        if (!this.f18163r) {
            Editor edit = this.f18164t.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    protected final boolean mo3036w() {
        return true;
    }

    final String m16288y() {
        mo1606c();
        return m16276D().getString("gmp_app_id", null);
    }

    final String m16289z() {
        synchronized (this.f18157l) {
            if (Math.abs(mo1614k().mo1576b() - this.f18156k) < 1000) {
                String str = this.f18155j;
                return str;
            }
            return null;
        }
    }
}
