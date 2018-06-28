package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C6493h;
import com.p111d.p112a.p121c.p128f.C6494i;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

@C1387a
public final class ab extends C1443v implements Serializable {
    protected final String f14747a;
    protected C6494i f14748b;
    protected C6494i f14749c;
    protected C6488s[] f14750d;
    protected C5354j f14751e;
    protected C6494i f14752f;
    protected C6488s[] f14753g;
    protected C5354j f14754h;
    protected C6494i f14755i;
    protected C6488s[] f14756j;
    protected C6494i f14757k;
    protected C6494i f14758l;
    protected C6494i f14759m;
    protected C6494i f14760n;
    protected C6494i f14761o;
    protected C6493h f14762p;

    public ab(C5354j c5354j) {
        this.f14747a = c5354j == null ? "UNKNOWN TYPE" : c5354j.toString();
    }

    private C5364l m11117a(C5347g c5347g, Throwable th) {
        if ((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) {
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
        }
        if (th instanceof C5364l) {
            return (C5364l) th;
        }
        return C5364l.m11573a(c5347g.m11472k(), String.format("Instantiation of %s value failed (%s): %s", new Object[]{this.f14747a, th.getClass().getName(), th.getMessage()}), th);
    }

    private Object m11118a(C6494i c6494i, C6488s[] c6488sArr, C5347g c5347g, Object obj) {
        if (c6494i == null) {
            StringBuilder stringBuilder = new StringBuilder("No delegate constructor for ");
            stringBuilder.append(this.f14747a);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (c6488sArr == null) {
            try {
                return c6494i.mo3353a(obj);
            } catch (Throwable th) {
                C5364l a = m11117a(c5347g, th);
            }
        } else {
            int length = c6488sArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                C6488s c6488s = c6488sArr[i];
                if (c6488s == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = c5347g.m11458b(c6488s.mo3349e());
                }
            }
            return c6494i.mo3354a(objArr);
        }
    }

    public final Object mo1300a(C5347g c5347g) {
        if (this.f14748b == null) {
            StringBuilder stringBuilder = new StringBuilder("No default constructor for ");
            stringBuilder.append(this.f14747a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            return this.f14748b.mo3357i();
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1313a(C5347g c5347g, double d) {
        if (this.f14760n == null) {
            throw c5347g.m11446a("Can not instantiate value of type %s from Floating-point number (%s); no one-double/Double-arg constructor/factory method", this.f14747a, Double.valueOf(d));
        }
        try {
            return this.f14760n.mo3353a(Double.valueOf(d));
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1314a(C5347g c5347g, int i) {
        try {
            if (this.f14758l != null) {
                return this.f14758l.mo3353a(Integer.valueOf(i));
            }
            if (this.f14759m != null) {
                return this.f14759m.mo3353a(Long.valueOf((long) i));
            }
            throw c5347g.m11446a("Can not instantiate value of type %s from Integral number (%s); no single-int-arg constructor/factory method", this.f14747a, Integer.valueOf(i));
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1315a(C5347g c5347g, long j) {
        if (this.f14759m == null) {
            throw c5347g.m11446a("Can not instantiate value of type %s from Long integral number (%s); no single-long-arg constructor/factory method", this.f14747a, Long.valueOf(j));
        }
        try {
            return this.f14759m.mo3353a(Long.valueOf(j));
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1316a(C5347g c5347g, Object obj) {
        return m11118a(this.f14752f, this.f14753g, c5347g, obj);
    }

    public final Object mo1317a(C5347g c5347g, String str) {
        if (this.f14757k == null) {
            return m3595b(c5347g, str);
        }
        try {
            return this.f14757k.mo3353a((Object) str);
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1318a(C5347g c5347g, boolean z) {
        if (this.f14761o == null) {
            throw c5347g.m11446a("Can not instantiate value of type %s from Boolean value (%s); no single-boolean/Boolean-arg constructor/factory method", this.f14747a, Boolean.valueOf(z));
        }
        try {
            return this.f14761o.mo3353a(Boolean.valueOf(z));
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final Object mo1319a(C5347g c5347g, Object[] objArr) {
        if (this.f14749c == null) {
            StringBuilder stringBuilder = new StringBuilder("No with-args constructor for ");
            stringBuilder.append(this.f14747a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            return this.f14749c.mo3354a(objArr);
        } catch (Throwable th) {
            C5364l a = m11117a(c5347g, th);
        }
    }

    public final String mo1301a() {
        return this.f14747a;
    }

    public final void m11128a(C6493h c6493h) {
        this.f14762p = c6493h;
    }

    public final void m11129a(C6494i c6494i) {
        this.f14757k = c6494i;
    }

    public final void m11130a(C6494i c6494i, C6494i c6494i2, C5354j c5354j, C6488s[] c6488sArr, C6494i c6494i3, C6488s[] c6488sArr2) {
        this.f14748b = c6494i;
        this.f14752f = c6494i2;
        this.f14751e = c5354j;
        this.f14753g = c6488sArr;
        this.f14749c = c6494i3;
        this.f14750d = c6488sArr2;
    }

    public final void m11131a(C6494i c6494i, C5354j c5354j, C6488s[] c6488sArr) {
        this.f14755i = c6494i;
        this.f14754h = c5354j;
        this.f14756j = c6488sArr;
    }

    public final C6488s[] mo1320a(C7089f c7089f) {
        return this.f14750d;
    }

    public final Object mo1321b(C5347g c5347g, Object obj) {
        return this.f14755i == null ? mo1316a(c5347g, obj) : m11118a(this.f14755i, this.f14756j, c5347g, obj);
    }

    public final void m11134b(C6494i c6494i) {
        this.f14758l = c6494i;
    }

    public final void m11135c(C6494i c6494i) {
        this.f14759m = c6494i;
    }

    public final boolean mo1322c() {
        return this.f14757k != null;
    }

    public final void m11137d(C6494i c6494i) {
        this.f14760n = c6494i;
    }

    public final boolean mo1323d() {
        return this.f14758l != null;
    }

    public final void m11139e(C6494i c6494i) {
        this.f14761o = c6494i;
    }

    public final boolean mo1324e() {
        return this.f14759m != null;
    }

    public final boolean mo1325f() {
        return this.f14760n != null;
    }

    public final boolean mo1326g() {
        return this.f14761o != null;
    }

    public final boolean mo1303h() {
        return this.f14748b != null;
    }

    public final boolean mo1327i() {
        return this.f14751e != null;
    }

    public final boolean mo1328j() {
        return this.f14754h != null;
    }

    public final boolean mo1329k() {
        return this.f14749c != null;
    }

    public final C5354j mo1330l() {
        return this.f14751e;
    }

    public final C5354j mo1331m() {
        return this.f14754h;
    }

    public final C6494i mo1332n() {
        return this.f14748b;
    }

    public final C6494i mo1333o() {
        return this.f14752f;
    }

    public final C6494i mo1334p() {
        return this.f14755i;
    }

    public final C6493h mo1335q() {
        return this.f14762p;
    }
}
