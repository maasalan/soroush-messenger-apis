package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.p125a.C1421s.C1420a;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.io.IOException;
import java.io.Serializable;

public final class C1441r implements Serializable {
    protected final C1446d f4533a;
    protected final C7087f f4534b;
    protected final C5354j f4535c;
    protected C1507k<Object> f4536d;
    protected final C1475c f4537e;

    private static class C5325a extends C1420a {
        private final C1441r f14784a;
        private final Object f14785d;
        private final String f14786e;

        public C5325a(C1441r c1441r, C6489t c6489t, Class<?> cls, Object obj, String str) {
            super(c6489t, cls);
            this.f14784a = c1441r;
            this.f14785d = obj;
            this.f14786e = str;
        }

        public final void mo1305a(Object obj, Object obj2) {
            if (m3509a(obj)) {
                this.f14784a.m3581a(this.f14785d, this.f14786e, obj2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Trying to resolve a forward reference with id [");
            stringBuilder.append(obj.toString());
            stringBuilder.append("] that wasn't previously registered.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public C1441r(C1446d c1446d, C7087f c7087f, C5354j c5354j, C1507k<Object> c1507k, C1475c c1475c) {
        this.f4533a = c1446d;
        this.f4534b = c7087f;
        this.f4535c = c5354j;
        this.f4536d = c1507k;
        this.f4537e = c1475c;
    }

    private String m3576d() {
        return this.f4534b.mo2818j().getName();
    }

    public final C1441r m3577a(C1507k<Object> c1507k) {
        return new C1441r(this.f4533a, this.f4534b, this.f4535c, c1507k, this.f4537e);
    }

    public final C1446d m3578a() {
        return this.f4533a;
    }

    public final Object m3579a(C5303j c5303j, C5347g c5347g) {
        return c5303j.getCurrentToken() == C1380m.VALUE_NULL ? null : this.f4537e != null ? this.f4536d.mo1308a(c5303j, c5347g, this.f4537e) : this.f4536d.mo1304a(c5303j, c5347g);
    }

    public final void m3580a(C5303j c5303j, C5347g c5347g, Object obj, String str) {
        try {
            m3581a(obj, str, m3579a(c5303j, c5347g));
        } catch (Throwable e) {
            if (this.f4536d.mo1312d() == null) {
                throw C5364l.m11573a(c5303j, "Unresolved forward reference but no identity info.", e);
            }
            e.f17711d.m3512a(new C5325a(this, e, this.f4535c.m11531e(), obj, str));
        }
    }

    public final void m3581a(Object obj, String str, Object obj2) {
        try {
            this.f4534b.m18494f().invoke(obj, new Object[]{str, obj2});
        } catch (Exception e) {
            Throwable e2 = e;
            if (e2 instanceof IllegalArgumentException) {
                String name = obj2 == null ? "[NULL]" : obj2.getClass().getName();
                StringBuilder stringBuilder = new StringBuilder("Problem deserializing \"any\" property '");
                stringBuilder.append(str);
                StringBuilder stringBuilder2 = new StringBuilder("' of class ");
                stringBuilder2.append(m3576d());
                stringBuilder2.append(" (expected type: ");
                stringBuilder.append(stringBuilder2.toString());
                stringBuilder.append(this.f4535c);
                stringBuilder.append("; actual type: ");
                stringBuilder.append(name);
                stringBuilder.append(")");
                str = e2.getMessage();
                if (str != null) {
                    stringBuilder.append(", problem: ");
                } else {
                    str = " (no error message provided)";
                }
                stringBuilder.append(str);
                throw new C5364l(null, stringBuilder.toString(), e2);
            } else if (e2 instanceof IOException) {
                throw ((IOException) e2);
            } else if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else {
                while (e2.getCause() != null) {
                    e2 = e2.getCause();
                }
                throw new C5364l(null, e2.getMessage(), e2);
            }
        }
    }

    public final boolean m3582b() {
        return this.f4536d != null;
    }

    public final C5354j m3583c() {
        return this.f4535c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[any property on class ");
        stringBuilder.append(m3576d());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
