package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5595r;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class C5550k extends C1948t<Time> {
    public static final C1949u f15366a = new C55491();
    private final DateFormat f15367b = new SimpleDateFormat("hh:mm:ss a");

    static class C55491 implements C1949u {
        C55491() {
        }

        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            return c1933a.f6422a == Time.class ? new C5550k() : null;
        }
    }

    private synchronized void m12166a(C1937c c1937c, Time time) {
        c1937c.mo1739b(time == null ? null : this.f15367b.format(time));
    }

    private synchronized Time m12167b(C1935a c1935a) {
        if (c1935a.mo1720f() == C1936b.NULL) {
            c1935a.mo1725k();
            return null;
        }
        try {
            return new Time(this.f15367b.parse(c1935a.mo1723i()).getTime());
        } catch (Throwable e) {
            throw new C5595r(e);
        }
    }

    public final /* synthetic */ Object mo1711a(C1935a c1935a) {
        return m12167b(c1935a);
    }
}
