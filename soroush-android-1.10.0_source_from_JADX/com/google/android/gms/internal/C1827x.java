package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.C1677r;
import com.google.android.gms.analytics.C5436i;
import com.google.android.gms.analytics.C6567d;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.common.util.C5476f;

public class C1827x {
    private static volatile C1827x f6282i;
    public final Context f6283a;
    final Context f6284b;
    public final C1785d f6285c = C5476f.m11826d();
    final ax f6286d = new ax(this);
    final bp f6287e;
    final bc f6288f;
    final bt f6289g;
    public final bb f6290h;
    private final C1677r f6291j;
    private final C6582o f6292k;
    private final cf f6293l;
    private final C6567d f6294m;
    private final ap f6295n;
    private final C6581n f6296o;
    private final ai f6297p;

    private C1827x(C1829z c1829z) {
        Context context = c1829z.f6299a;
        ac.m4377a((Object) context, (Object) "Application context can't be null");
        Object obj = c1829z.f6300b;
        ac.m4376a(obj);
        this.f6283a = context;
        this.f6284b = obj;
        C5506v bpVar = new bp(this);
        bpVar.m12038l();
        this.f6287e = bpVar;
        C1825u a = m5160a();
        String str = C1826w.f6280a;
        StringBuilder stringBuilder = new StringBuilder(134 + String.valueOf(str).length());
        stringBuilder.append("Google Analytics ");
        stringBuilder.append(str);
        stringBuilder.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        a.m5150d(stringBuilder.toString());
        bpVar = new bt(this);
        bpVar.m12038l();
        this.f6289g = bpVar;
        bpVar = new cf(this);
        bpVar.m12038l();
        this.f6293l = bpVar;
        bpVar = new C6582o(this, c1829z);
        C5506v apVar = new ap(this);
        C5506v c6581n = new C6581n(this);
        C5506v aiVar = new ai(this);
        C5506v bbVar = new bb(this);
        C1677r a2 = C1677r.m4271a(context);
        a2.f5166c = new C1828y(this);
        this.f6291j = a2;
        C5436i c6567d = new C6567d(this);
        apVar.m12038l();
        this.f6295n = apVar;
        c6581n.m12038l();
        this.f6296o = c6581n;
        aiVar.m12038l();
        this.f6297p = aiVar;
        bbVar.m12038l();
        this.f6290h = bbVar;
        apVar = new bc(this);
        apVar.m12038l();
        this.f6288f = apVar;
        bpVar.m12038l();
        this.f6292k = bpVar;
        cf e = c6567d.f15089f.m5164e();
        e.m16016d();
        if (e.m16017e()) {
            c6567d.f17936d = e.m16018f();
        }
        e.m16016d();
        c6567d.f17933a = true;
        this.f6294m = c6567d;
        bpVar.f18396a.m15973b();
    }

    public static C1827x m5158a(Context context) {
        ac.m4376a((Object) context);
        if (f6282i == null) {
            synchronized (C1827x.class) {
                if (f6282i == null) {
                    C1785d d = C5476f.m11826d();
                    long b = d.mo1576b();
                    C1827x c1827x = new C1827x(new C1829z(context));
                    f6282i = c1827x;
                    C6567d.m15851a();
                    long b2 = d.mo1576b() - b;
                    long longValue = ((Long) bf.f5546E.f5585a).longValue();
                    if (b2 > longValue) {
                        c1827x.m5160a().m5149c("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f6282i;
    }

    static void m5159a(C5506v c5506v) {
        ac.m4377a((Object) c5506v, (Object) "Analytics service not created/initialized");
        ac.m4386b(c5506v.m12036j(), "Analytics service not initialized");
    }

    public final bp m5160a() {
        C1827x.m5159a(this.f6287e);
        return this.f6287e;
    }

    public final C1677r m5161b() {
        ac.m4376a(this.f6291j);
        return this.f6291j;
    }

    public final C6582o m5162c() {
        C1827x.m5159a(this.f6292k);
        return this.f6292k;
    }

    public final C6567d m5163d() {
        ac.m4376a(this.f6294m);
        ac.m4386b(this.f6294m.f17933a, "Analytics instance not initialized");
        return this.f6294m;
    }

    public final cf m5164e() {
        C1827x.m5159a(this.f6293l);
        return this.f6293l;
    }

    public final C6581n m5165f() {
        C1827x.m5159a(this.f6296o);
        return this.f6296o;
    }

    public final ap m5166g() {
        C1827x.m5159a(this.f6295n);
        return this.f6295n;
    }

    public final ai m5167h() {
        C1827x.m5159a(this.f6297p);
        return this.f6297p;
    }
}
