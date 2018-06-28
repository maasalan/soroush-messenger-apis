package com.p085c.p086a.p089c.p097c.p512a;

import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1180q;
import com.p085c.p086a.p089c.p097c.C5190g;
import java.io.InputStream;
import java.net.URL;

public final class C5169e implements C1173m<URL, InputStream> {
    private final C1173m<C5190g, InputStream> f14483a;

    public static class C5168a implements C1174n<URL, InputStream> {
        public final C1173m<URL, InputStream> mo1184a(C1180q c1180q) {
            return new C5169e(c1180q.m2803a(C5190g.class, InputStream.class));
        }
    }

    public C5169e(C1173m<C5190g, InputStream> c1173m) {
        this.f14483a = c1173m;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        return this.f14483a.mo1185a(new C5190g((URL) obj), i, i2, c5253j);
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return true;
    }
}
