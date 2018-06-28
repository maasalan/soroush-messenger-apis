package com.p085c.p086a.p089c.p092b;

import android.os.Looper;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p109i.C1271h;

public final class C5152n<Z> implements C1159s<Z> {
    final boolean f14436a;
    C1154a f14437b;
    C1208h f14438c;
    private int f14439d;
    private boolean f14440e;
    private final C1159s<Z> f14441f;

    interface C1154a {
        void mo1175b(C1208h c1208h, C5152n<?> c5152n);
    }

    public C5152n(C1159s<Z> c1159s, boolean z) {
        this.f14441f = (C1159s) C1271h.m3012a((Object) c1159s, "Argument must not be null");
        this.f14436a = z;
    }

    public final Class<Z> mo1179a() {
        return this.f14441f.mo1179a();
    }

    public final Z mo1180b() {
        return this.f14441f.mo1180b();
    }

    public final int mo1181c() {
        return this.f14441f.mo1181c();
    }

    public final void mo1182d() {
        if (this.f14439d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f14440e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f14440e = true;
            this.f14441f.mo1182d();
        }
    }

    public final void m10623e() {
        if (this.f14440e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f14439d++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    public final void m10624f() {
        if (this.f14439d <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f14439d - 1;
            this.f14439d = i;
            if (i == 0) {
                this.f14437b.mo1175b(this.f14438c, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EngineResource{isCacheable=");
        stringBuilder.append(this.f14436a);
        stringBuilder.append(", listener=");
        stringBuilder.append(this.f14437b);
        stringBuilder.append(", key=");
        stringBuilder.append(this.f14438c);
        stringBuilder.append(", acquired=");
        stringBuilder.append(this.f14439d);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(this.f14440e);
        stringBuilder.append(", resource=");
        stringBuilder.append(this.f14441f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
