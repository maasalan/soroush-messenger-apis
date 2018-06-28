package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p133j.C7410a;
import com.p111d.p112a.p121c.p133j.C7413m;
import com.p111d.p112a.p121c.p133j.C7415o;

public final class C7063o extends C6474d<C6524m> {
    private static final C7063o f20165a = new C7063o();

    static final class C7061a extends C6474d<C7410a> {
        protected static final C7061a f20163a = new C7061a();

        protected C7061a() {
            super(C7410a.class);
        }

        public static C7061a m18345f() {
            return f20163a;
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            if (c5303j.isExpectedStartArrayToken()) {
                return m15450b(c5303j, c5347g, c5347g.m11474m());
            }
            throw c5347g.m11457b(C7410a.class);
        }
    }

    static final class C7062b extends C6474d<C7415o> {
        protected static final C7062b f20164a = new C7062b();

        protected C7062b() {
            super(C7415o.class);
        }

        public static C7062b m18347f() {
            return f20164a;
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            if (!c5303j.isExpectedStartObjectToken()) {
                if (!c5303j.hasToken(C1380m.FIELD_NAME)) {
                    if (c5303j.hasToken(C1380m.END_OBJECT)) {
                        return c5347g.m11474m().m3819c();
                    }
                    throw c5347g.m11457b(C7415o.class);
                }
            }
            return m15448a(c5303j, c5347g, c5347g.m11474m());
        }
    }

    protected C7063o() {
        super(C6524m.class);
    }

    public static C1507k<? extends C6524m> m18349a(Class<?> cls) {
        return cls == C7415o.class ? C7062b.m18347f() : cls == C7410a.class ? C7061a.m18345f() : f20165a;
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        int currentTokenId = c5303j.getCurrentTokenId();
        return currentTokenId != 1 ? currentTokenId != 3 ? m15452c(c5303j, c5347g, c5347g.m11474m()) : m15450b(c5303j, c5347g, c5347g.m11474m()) : m15448a(c5303j, c5347g, c5347g.m11474m());
    }

    public final /* bridge */ /* synthetic */ Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return super.mo1308a(c5303j, c5347g, c1475c);
    }

    public final /* synthetic */ Object mo2803a(C5347g c5347g) {
        return C7413m.m19714f();
    }

    public final /* bridge */ /* synthetic */ boolean mo1311b() {
        return super.mo1311b();
    }

    public final /* synthetic */ Object mo2804e() {
        return C7413m.m19714f();
    }
}
