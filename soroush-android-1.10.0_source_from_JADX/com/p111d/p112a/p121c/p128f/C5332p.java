package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.p123b.C5306f;
import java.io.Serializable;

public abstract class C5332p implements C1446d, Serializable {
    protected final C1548u f14824r;
    protected transient C1319d f14825s;

    protected C5332p(C5332p c5332p) {
        this.f14824r = c5332p.f14824r;
        this.f14825s = c5332p.f14825s;
    }

    protected C5332p(C1548u c1548u) {
        if (c1548u == null) {
            c1548u = C1548u.f4830c;
        }
        this.f14824r = c1548u;
    }

    public final C1319d mo1349a(C5306f<?> c5306f) {
        C1319d d = c5306f.mo3362d();
        C5308b a = c5306f.mo3358a();
        C1449a c = mo1354c();
        if (a == null || c == null) {
            return d;
        }
        C1319d findFormat = a.findFormat(c);
        return findFormat == null ? d : d.m3113a(findFormat);
    }

    public final C1328b mo1352b(C5306f<?> c5306f) {
        C1328b c = c5306f.mo3361c();
        C5308b a = c5306f.mo3358a();
        C1449a c2 = mo1354c();
        if (a == null || c2 == null) {
            return c;
        }
        C1328b findPropertyInclusion = a.findPropertyInclusion(c2);
        return findPropertyInclusion == null ? c : c.m3138a(findPropertyInclusion);
    }

    public final C1548u mo1353b() {
        return this.f14824r;
    }

    public final boolean m11340p() {
        return this.f14824r.m4054a();
    }
}
