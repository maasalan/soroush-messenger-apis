package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5595r;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class C5548j extends C1948t<Date> {
    public static final C1949u f15364a = new C55471();
    private final DateFormat f15365b = new SimpleDateFormat("MMM d, yyyy");

    static class C55471 implements C1949u {
        C55471() {
        }

        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            return c1933a.f6422a == Date.class ? new C5548j() : null;
        }
    }

    private synchronized void m12161a(C1937c c1937c, Date date) {
        c1937c.mo1739b(date == null ? null : this.f15365b.format(date));
    }

    private synchronized Date m12162b(C1935a c1935a) {
        if (c1935a.mo1720f() == C1936b.NULL) {
            c1935a.mo1725k();
            return null;
        }
        try {
            return new Date(this.f15365b.parse(c1935a.mo1723i()).getTime());
        } catch (Throwable e) {
            throw new C5595r(e);
        }
    }

    public final /* synthetic */ Object mo1711a(C1935a c1935a) {
        return m12162b(c1935a);
    }
}
