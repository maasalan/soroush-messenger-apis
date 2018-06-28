package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5302i;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.p116c.C1345a;

public final class C5294d extends C1379l {
    protected final C5294d f14684c;
    protected C1358b f14685d;
    protected C5294d f14686e;
    protected String f14687f;
    protected Object f14688g;
    protected int f14689h;
    protected int f14690i;

    private C5294d(C5294d c5294d, C1358b c1358b, int i, int i2, int i3) {
        this.f14684c = c5294d;
        this.f14685d = c1358b;
        this.a = i;
        this.f14689h = i2;
        this.f14690i = i3;
        this.b = -1;
    }

    private void m10979a(int i, int i2, int i3) {
        this.a = i;
        this.b = -1;
        this.f14689h = i2;
        this.f14690i = i3;
        this.f14687f = null;
        this.f14688g = null;
        if (this.f14685d != null) {
            this.f14685d.m3268b();
        }
    }

    public static C5294d m10980b(C1358b c1358b) {
        return new C5294d(null, c1358b, 0, 1, 0);
    }

    public final C5294d m10981a(int i, int i2) {
        C5294d c5294d = this.f14686e;
        if (c5294d == null) {
            C5294d c5294d2 = new C5294d(this, this.f14685d == null ? null : this.f14685d.m3266a(), 1, i, i2);
            this.f14686e = c5294d2;
            return c5294d2;
        }
        c5294d.m10979a(1, i, i2);
        return c5294d;
    }

    public final C5294d m10982a(C1358b c1358b) {
        this.f14685d = c1358b;
        return this;
    }

    public final /* bridge */ /* synthetic */ C1379l mo1278a() {
        return this.f14684c;
    }

    public final void mo1279a(Object obj) {
        this.f14688g = obj;
    }

    public final void m10985a(String str) {
        this.f14687f = str;
        if (this.f14685d != null) {
            C1358b c1358b = this.f14685d;
            if (c1358b.m3267a(str)) {
                Object c = c1358b.m3269c();
                C5303j c5303j = c instanceof C5301g ? (C5303j) c : null;
                StringBuilder stringBuilder = new StringBuilder("Duplicate field '");
                stringBuilder.append(str);
                stringBuilder.append("'");
                throw new C5302i(c5303j, stringBuilder.toString());
            }
        }
    }

    public final C5294d m10986b(int i, int i2) {
        C5294d c5294d = this.f14686e;
        if (c5294d == null) {
            C5294d c5294d2 = new C5294d(this, this.f14685d == null ? null : this.f14685d.m3266a(), 2, i, i2);
            this.f14686e = c5294d2;
            return c5294d2;
        }
        c5294d.m10979a(2, i, i2);
        return c5294d;
    }

    public final C1375h m10987b(Object obj) {
        return new C1375h(obj, this.f14689h, this.f14690i);
    }

    public final Object mo1280h() {
        return this.f14688g;
    }

    public final String m10989i() {
        return this.f14687f;
    }

    public final C5294d m10990j() {
        return this.f14684c;
    }

    public final C5294d m10991k() {
        this.f14688g = null;
        return this.f14684c;
    }

    public final C1358b m10992l() {
        return this.f14685d;
    }

    public final boolean m10993m() {
        int i = this.b + 1;
        this.b = i;
        return this.a != 0 && i > 0;
    }

    public final String toString() {
        char c;
        StringBuilder stringBuilder = new StringBuilder(64);
        switch (this.a) {
            case 0:
                stringBuilder.append("/");
                break;
            case 1:
                stringBuilder.append('[');
                stringBuilder.append(m3362g());
                c = ']';
                break;
            case 2:
                stringBuilder.append('{');
                if (this.f14687f != null) {
                    c = '\"';
                    stringBuilder.append('\"');
                    C1345a.m3179a(stringBuilder, this.f14687f);
                } else {
                    c = '?';
                }
                stringBuilder.append(c);
                c = '}';
                break;
            default:
                break;
        }
        stringBuilder.append(c);
        return stringBuilder.toString();
    }
}
