package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1544n;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class C6522k extends C5354j implements C1544n {
    private static final C1512l f17769f = C1512l.m3899a();
    private static final C5354j[] f17770g = new C5354j[0];
    protected final C5354j f17771h;
    protected final C5354j[] f17772i;
    protected final C1512l f17773j;
    volatile transient String f17774k;

    protected C6522k(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
        if (c1512l == null) {
            c1512l = f17769f;
        }
        this.f17773j = c1512l;
        this.f17771h = c5354j;
        this.f17772i = c5354jArr;
    }

    protected static StringBuilder m15724a(Class<?> cls, StringBuilder stringBuilder) {
        if (cls.isPrimitive()) {
            char c;
            if (cls == Boolean.TYPE) {
                c = 'Z';
            } else if (cls == Byte.TYPE) {
                c = 'B';
            } else if (cls == Short.TYPE) {
                c = 'S';
            } else if (cls == Character.TYPE) {
                c = 'C';
            } else if (cls == Integer.TYPE) {
                c = 'I';
            } else if (cls == Long.TYPE) {
                c = 'J';
            } else if (cls == Float.TYPE) {
                c = 'F';
            } else if (cls == Double.TYPE) {
                c = 'D';
            } else if (cls == Void.TYPE) {
                c = 'V';
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("Unrecognized primitive type: ");
                stringBuilder2.append(cls.getName());
                throw new IllegalStateException(stringBuilder2.toString());
            }
            stringBuilder.append(c);
            return stringBuilder;
        }
        stringBuilder.append('L');
        String name = cls.getName();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char charAt = name.charAt(i);
            if (charAt == '.') {
                charAt = '/';
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder;
    }

    public final <T> T mo2930A() {
        return this.c;
    }

    public final <T> T mo2931B() {
        return this.d;
    }

    protected String mo3395D() {
        return this.a.getName();
    }

    public final C5354j mo2932a(int i) {
        C1512l c1512l = this.f17773j;
        if (i >= 0) {
            if (i < c1512l.f4701b.length) {
                return c1512l.f4701b[i];
            }
        }
        return null;
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeString(mo2933c());
    }

    public final void mo1484a(C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2903a((Object) this, c5301g);
        mo1483a(c5301g, aaVar);
        c1478f.mo2910d(this, c5301g);
    }

    public final String mo2933c() {
        String str = this.f17774k;
        return str == null ? mo3395D() : str;
    }

    public final C5354j mo2934e(Class<?> cls) {
        if (cls == this.a) {
            return this;
        }
        if (cls.isInterface() && this.f17772i != null) {
            for (C5354j e : this.f17772i) {
                C5354j e2 = e2.mo2934e(cls);
                if (e2 != null) {
                    return e2;
                }
            }
        }
        if (this.f17771h != null) {
            C5354j e3 = this.f17771h.mo2934e(cls);
            if (e3 != null) {
                return e3;
            }
        }
        return null;
    }

    public final int mo2935w() {
        return this.f17773j.f4701b.length;
    }

    public final C1512l mo2936x() {
        return this.f17773j;
    }

    public final C5354j mo2937y() {
        return this.f17771h;
    }

    public final List<C5354j> mo2938z() {
        if (this.f17772i == null) {
            return Collections.emptyList();
        }
        switch (this.f17772i.length) {
            case 0:
                return Collections.emptyList();
            case 1:
                return Collections.singletonList(this.f17772i[0]);
            default:
                return Arrays.asList(this.f17772i);
        }
    }
}
