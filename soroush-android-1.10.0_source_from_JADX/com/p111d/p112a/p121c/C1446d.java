package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p138m.C1517a;

public interface C1446d {
    public static final C1319d f4542a = new C1319d();
    public static final C1328b f4543b = C1328b.m3136a();

    public static class C7084a implements C1446d {
        protected final C1549v f14787c;
        protected final C5354j f14788d;
        protected final C1549v f14789e;
        protected final C1548u f14790f;
        protected final C5328e f14791g;
        protected final C1517a f14792h;

        private C7084a(C7084a c7084a, C5354j c5354j) {
            this(c7084a.f14787c, c5354j, c7084a.f14789e, c7084a.f14792h, c7084a.f14791g, c7084a.f14790f);
        }

        public C7084a(C1549v c1549v, C5354j c5354j, C1549v c1549v2, C1517a c1517a, C5328e c5328e, C1548u c1548u) {
            this.f14787c = c1549v;
            this.f14788d = c5354j;
            this.f14789e = c1549v2;
            this.f14790f = c1548u;
            this.f14791g = c5328e;
            this.f14792h = c1517a;
        }

        public final C1319d mo1349a(C5306f<?> c5306f) {
            C1319d d = c5306f.mo3362d();
            C5308b a = c5306f.mo3358a();
            if (a == null || this.f14791g == null) {
                return d;
            }
            C1319d findFormat = a.findFormat(this.f14791g);
            return findFormat == null ? d : d.m3113a(findFormat);
        }

        public final C7084a m11225a(C5354j c5354j) {
            return new C7084a(this, c5354j);
        }

        public final C5354j mo1350a() {
            return this.f14788d;
        }

        public final void mo1351a(C5346d c5346d, aa aaVar) {
            StringBuilder stringBuilder = new StringBuilder("Instances of ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" should not get visited");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        public final C1328b mo1352b(C5306f<?> c5306f) {
            C1328b c = c5306f.mo3361c();
            C5308b a = c5306f.mo3358a();
            if (a == null || this.f14791g == null) {
                return c;
            }
            C1328b findPropertyInclusion = a.findPropertyInclusion(this.f14791g);
            return findPropertyInclusion == null ? c : c.m3138a(findPropertyInclusion);
        }

        public final C1548u mo1353b() {
            return this.f14790f;
        }

        public final C5328e mo1354c() {
            return this.f14791g;
        }

        public final C1549v m11231d() {
            return this.f14789e;
        }
    }

    C1319d mo1349a(C5306f<?> c5306f);

    C5354j mo1350a();

    void mo1351a(C5346d c5346d, aa aaVar);

    C1328b mo1352b(C5306f<?> c5306f);

    C1548u mo1353b();

    C5328e mo1354c();
}
