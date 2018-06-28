package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p121c.p124c.C1441r;
import com.p111d.p112a.p121c.p124c.C6488s;
import java.util.Map;

public abstract class C1418q {
    public final C1418q f4485a;
    public final Object f4486b;

    static final class C5312a extends C1418q {
        final C1441r f14734c;
        final String f14735d;

        public C5312a(C1418q c1418q, Object obj, C1441r c1441r, String str) {
            super(c1418q, obj);
            this.f14734c = c1441r;
            this.f14735d = str;
        }

        public final void mo1306a(Object obj) {
            this.f14734c.m3581a(obj, this.f14735d, this.b);
        }
    }

    static final class C5313b extends C1418q {
        final Object f14736c;

        public C5313b(C1418q c1418q, Object obj, Object obj2) {
            super(c1418q, obj);
            this.f14736c = obj2;
        }

        public final void mo1306a(Object obj) {
            ((Map) obj).put(this.f14736c, this.b);
        }
    }

    static final class C5314c extends C1418q {
        final C6488s f14737c;

        public C5314c(C1418q c1418q, Object obj, C6488s c6488s) {
            super(c1418q, obj);
            this.f14737c = c6488s;
        }

        public final void mo1306a(Object obj) {
            this.f14737c.mo3336a(obj, this.b);
        }
    }

    protected C1418q(C1418q c1418q, Object obj) {
        this.f4485a = c1418q;
        this.f4486b = obj;
    }

    public abstract void mo1306a(Object obj);
}
