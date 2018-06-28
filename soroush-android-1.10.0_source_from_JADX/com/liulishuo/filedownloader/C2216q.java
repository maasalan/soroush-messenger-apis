package com.liulishuo.filedownloader;

import android.app.Application;
import com.liulishuo.filedownloader.C5666f.C2169a;
import com.liulishuo.filedownloader.C5671m.C2194a;
import com.liulishuo.filedownloader.p200c.C2147c;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p201d.C2163d;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.services.C2222c;
import com.liulishuo.filedownloader.services.C2222c.C2221a;

public final class C2216q {
    private static final Object f7317a = new Object();
    private static final Object f7318c = new Object();
    private C2228v f7319b;
    private C2227u f7320d;

    private static final class C2215a {
        private static final C2216q f7316a = new C2216q();
    }

    public static C2135a m6072a(String str) {
        return new C5658c(str);
    }

    public static C2216q m6073a() {
        return C2215a.f7316a;
    }

    public static C2221a m6074a(Application application) {
        C2181c.f7248a = application.getApplicationContext();
        C2221a c2221a = new C2221a();
        C2147c a = C2146a.f7150a;
        synchronized (a) {
            a.f7151a = new C2222c(c2221a);
            a.f7152b = null;
            a.f7153c = null;
            a.f7154d = null;
            a.f7155e = null;
        }
        return c2221a;
    }

    public static boolean m6075b() {
        return C2194a.f7278a.mo1959b();
    }

    final C2228v m6076c() {
        if (this.f7319b == null) {
            synchronized (f7317a) {
                if (this.f7319b == null) {
                    this.f7319b = new aa();
                }
            }
        }
        return this.f7319b;
    }

    final C2227u m6077d() {
        if (this.f7320d == null) {
            synchronized (f7318c) {
                if (this.f7320d == null) {
                    this.f7320d = new C6612y();
                    C2169a.f7242a.m5934a("event.service.connect.changed", (C2163d) (C5661e) this.f7320d);
                }
            }
        }
        return this.f7320d;
    }
}
