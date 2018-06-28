package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.internal.mt;
import com.google.android.gms.internal.mu;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;
import com.google.android.gms.internal.zzevc;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends mu implements Parcelable {
    @Keep
    public static final Creator<Trace> CREATOR = new C2099b();
    private static final Map<String, Trace> f18850i = new ConcurrentHashMap();
    private static Creator<Trace> f18851m = new C2100c();
    final String f18852a;
    final List<Trace> f18853b;
    final Map<String, zza> f18854c;
    final Map<String, String> f18855d;
    zzevc f18856g;
    zzevc f18857h;
    private final Trace f18858j;
    private final ng f18859k;
    private final mv f18860l;

    private Trace(Parcel parcel, boolean z) {
        super(z ? null : mt.m5013a());
        this.f18858j = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f18852a = parcel.readString();
        this.f18853b = new ArrayList();
        parcel.readList(this.f18853b, Trace.class.getClassLoader());
        this.f18854c = new ConcurrentHashMap();
        this.f18855d = new ConcurrentHashMap();
        parcel.readMap(this.f18854c, zza.class.getClassLoader());
        this.f18856g = (zzevc) parcel.readParcelable(zzevc.class.getClassLoader());
        this.f18857h = (zzevc) parcel.readParcelable(zzevc.class.getClassLoader());
        if (z) {
            this.f18860l = null;
            this.f18859k = null;
            return;
        }
        this.f18860l = mv.m5020a();
        this.f18859k = new ng();
    }

    private Trace(String str) {
        this(str, mv.m5020a(), new ng(), mt.m5013a());
    }

    private Trace(String str, mv mvVar, ng ngVar, mt mtVar) {
        super(mtVar);
        this.f18858j = null;
        this.f18852a = str.trim();
        this.f18853b = new ArrayList();
        this.f18854c = new ConcurrentHashMap();
        this.f18855d = new ConcurrentHashMap();
        this.f18859k = ngVar;
        this.f18860l = mvVar;
    }

    public static Trace m16936a(String str) {
        return new Trace(str);
    }

    private final boolean m16937a() {
        return this.f18857h != null;
    }

    private final boolean m16938d() {
        return this.f18856g != null;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    protected void finalize() {
        try {
            int i = (!m16938d() || m16937a()) ? 0 : 1;
            if (i != 0) {
                Log.w("FirebasePerformance", String.format("Trace '%s' is started but not stopped when it is destructed!", new Object[]{this.f18852a}));
                this.f15297e.f6158a.addAndGet(1);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    @Keep
    public void incrementCounter(String str) {
        incrementCounter(str, 1);
    }

    @Keep
    public void incrementCounter(String str, long j) {
        String str2;
        if (str != null) {
            if (str.length() <= 100) {
                if (str.startsWith("_")) {
                    nh[] values = nh.values();
                    int length = values.length;
                    int i = 0;
                    while (i < length) {
                        if (!values[i].toString().equals(str)) {
                            i++;
                        }
                    }
                    str2 = "Counter name must not start with '_'";
                }
                str2 = null;
                break;
            }
            str2 = String.format(Locale.US, "Counter name must not exceed %d characters", new Object[]{Integer.valueOf(100)});
        } else {
            str2 = "Counter name must not be null";
        }
        if (str2 != null) {
            Log.e("FirebasePerformance", String.format("Cannot increment counter %s. Counter name is invalid.(%s)", new Object[]{str, str2}));
        } else if (!m16938d()) {
            Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's not started", new Object[]{str, this.f18852a}));
        } else if (m16937a()) {
            Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's been stopped", new Object[]{str, this.f18852a}));
        } else {
            str = str.trim();
            zza com_google_firebase_perf_metrics_zza = (zza) this.f18854c.get(str);
            if (com_google_firebase_perf_metrics_zza == null) {
                com_google_firebase_perf_metrics_zza = new zza(str);
                this.f18854c.put(str, com_google_firebase_perf_metrics_zza);
            }
            r0.f7069a += j;
        }
    }

    @Keep
    public void start() {
        String str = this.f18852a;
        if (str != null) {
            if (str.length() <= 100) {
                if (str.startsWith("_")) {
                    ni[] values = ni.values();
                    int length = values.length;
                    int i = 0;
                    while (i < length) {
                        if (!values[i].toString().equals(str)) {
                            i++;
                        }
                    }
                    str = "Trace name must not start with '_'";
                }
                str = null;
                break;
            }
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{Integer.valueOf(100)});
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            Log.e("FirebasePerformance", String.format("Cannot start trace %s. Trace name is invalid.(%s)", new Object[]{this.f18852a, str}));
        } else if (this.f18856g != null) {
            Log.e("FirebasePerformance", String.format("Trace '%s' has already started, should not start again!", new Object[]{this.f18852a}));
        } else {
            this.f18856g = new zzevc();
            m12014b();
        }
    }

    @Keep
    public void stop() {
        if (!m16938d()) {
            Log.e("FirebasePerformance", String.format("Trace '%s' has not been started so unable to stop!", new Object[]{this.f18852a}));
        } else if (m16937a()) {
            Log.e("FirebasePerformance", String.format("Trace '%s' has already stopped, should not stop again!", new Object[]{this.f18852a}));
        } else {
            m12016c();
            this.f18857h = new zzevc();
            if (this.f18858j == null) {
                zzevc com_google_android_gms_internal_zzevc = this.f18857h;
                if (!this.f18853b.isEmpty()) {
                    Trace trace = (Trace) this.f18853b.get(this.f18853b.size() - 1);
                    if (trace.f18857h == null) {
                        trace.f18857h = com_google_android_gms_internal_zzevc;
                    }
                }
                if (this.f18852a.isEmpty()) {
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                } else if (this.f18860l != null) {
                    this.f18860l.m5026a(new C2101d(this).m5737a(), this.f15298f);
                }
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18858j, 0);
        parcel.writeString(this.f18852a);
        parcel.writeList(this.f18853b);
        parcel.writeMap(this.f18854c);
        parcel.writeParcelable(this.f18856g, 0);
        parcel.writeParcelable(this.f18857h, 0);
    }
}
