package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C5298f;
import com.p111d.p112a.p114b.C5301g;

public final class C5295e extends C1379l {
    protected final C5295e f14691c;
    protected C1358b f14692d;
    protected C5295e f14693e;
    protected String f14694f;
    protected Object f14695g;
    protected boolean f14696h;

    private C5295e(int i, C5295e c5295e, C1358b c1358b) {
        this.a = i;
        this.f14691c = c5295e;
        this.f14692d = c1358b;
        this.b = -1;
    }

    private C5295e m10994a(int i) {
        this.a = i;
        this.b = -1;
        this.f14694f = null;
        this.f14696h = false;
        this.f14695g = null;
        if (this.f14692d != null) {
            this.f14692d.m3268b();
        }
        return this;
    }

    public static C5295e m10995b(C1358b c1358b) {
        return new C5295e(0, null, c1358b);
    }

    public final int m10996a(String str) {
        if (this.f14696h) {
            return 4;
        }
        this.f14696h = true;
        this.f14694f = str;
        if (this.f14692d != null) {
            C1358b c1358b = this.f14692d;
            if (c1358b.m3267a(str)) {
                Object c = c1358b.m3269c();
                StringBuilder stringBuilder = new StringBuilder("Duplicate field '");
                stringBuilder.append(str);
                stringBuilder.append("'");
                throw new C5298f(stringBuilder.toString(), c instanceof C5301g ? (C5301g) c : null);
            }
        }
        return this.b < 0 ? 0 : 1;
    }

    public final C5295e m10997a(C1358b c1358b) {
        this.f14692d = c1358b;
        return this;
    }

    public final /* bridge */ /* synthetic */ C1379l mo1278a() {
        return this.f14691c;
    }

    public final void mo1279a(Object obj) {
        this.f14695g = obj;
    }

    public final Object mo1280h() {
        return this.f14695g;
    }

    public final C5295e m11001i() {
        C5295e c5295e = this.f14693e;
        if (c5295e != null) {
            return c5295e.m10994a(1);
        }
        c5295e = new C5295e(1, this, this.f14692d == null ? null : this.f14692d.m3266a());
        this.f14693e = c5295e;
        return c5295e;
    }

    public final C5295e m11002j() {
        C5295e c5295e = this.f14693e;
        if (c5295e != null) {
            return c5295e.m10994a(2);
        }
        c5295e = new C5295e(2, this, this.f14692d == null ? null : this.f14692d.m3266a());
        this.f14693e = c5295e;
        return c5295e;
    }

    public final C5295e m11003k() {
        return this.f14691c;
    }

    public final C5295e m11004l() {
        this.f14695g = null;
        return this.f14691c;
    }

    public final C1358b m11005m() {
        return this.f14692d;
    }

    public final int m11006n() {
        if (this.a == 2) {
            if (!this.f14696h) {
                return 5;
            }
            this.f14696h = false;
            this.b++;
            return 2;
        } else if (this.a == 1) {
            int i = this.b;
            this.b++;
            return i < 0 ? 0 : 1;
        } else {
            this.b++;
            return this.b == 0 ? 0 : 3;
        }
    }

    public final String toString() {
        char c;
        StringBuilder stringBuilder = new StringBuilder(64);
        if (this.a == 2) {
            stringBuilder.append('{');
            if (this.f14694f != null) {
                c = '\"';
                stringBuilder.append('\"');
                stringBuilder.append(this.f14694f);
            } else {
                c = '?';
            }
            stringBuilder.append(c);
            c = '}';
        } else if (this.a == 1) {
            stringBuilder.append('[');
            stringBuilder.append(m3362g());
            c = ']';
        } else {
            stringBuilder.append("/");
            return stringBuilder.toString();
        }
        stringBuilder.append(c);
        return stringBuilder.toString();
    }
}
