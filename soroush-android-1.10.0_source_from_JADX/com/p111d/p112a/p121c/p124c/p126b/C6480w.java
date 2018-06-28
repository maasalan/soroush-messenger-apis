package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1440q;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1529i;

public class C6480w<T> extends C5320x<T> implements C1434i, C1440q {
    protected final C1529i<Object, T> f17665a;
    protected final C5354j f17666b;
    protected final C1507k<Object> f17667c;

    public C6480w(C1529i<Object, T> c1529i, C5354j c5354j, C1507k<?> c1507k) {
        super(c5354j);
        this.f17665a = c1529i;
        this.f17666b = c5354j;
        this.f17667c = c1507k;
    }

    private C6480w<T> m15473a(C1529i<Object, T> c1529i, C5354j c5354j, C1507k<?> c1507k) {
        if (getClass() == C6480w.class) {
            return new C6480w(c1529i, c5354j, c1507k);
        }
        StringBuilder stringBuilder = new StringBuilder("Sub-class ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" must override 'withDelegate'");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private T m15474f() {
        return this.f17665a.m3990a();
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        if (this.f17667c != null) {
            C1507k b = c5347g.m11455b(this.f17667c, c1446d, this.f17666b);
            return b != this.f17667c ? m15473a(this.f17665a, this.f17666b, b) : this;
        } else {
            C1529i c1529i = this.f17665a;
            c5347g.mo1297b();
            C5354j b2 = c1529i.m3991b();
            return m15473a(this.f17665a, b2, c5347g.m11437a(b2, c1446d));
        }
    }

    public final Class<?> mo1307a() {
        return this.f17667c.mo1307a();
    }

    public final T mo1304a(C5303j c5303j, C5347g c5347g) {
        return this.f17667c.mo1304a(c5303j, c5347g) == null ? null : m15474f();
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return this.f17667c.mo1308a(c5303j, c5347g, c1475c) == null ? null : m15474f();
    }

    public final T mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        if (this.f17666b.m11531e().isAssignableFrom(obj.getClass())) {
            return this.f17667c.mo1309a(c5303j, c5347g, obj);
        }
        StringBuilder stringBuilder = new StringBuilder("Can not update object of type %s (using deserializer for type %s)");
        stringBuilder.append(obj.getClass().getName());
        throw new UnsupportedOperationException(String.format(stringBuilder.toString(), new Object[]{this.f17666b}));
    }

    public final void mo2802c(C5347g c5347g) {
        if (this.f17667c != null && (this.f17667c instanceof C1440q)) {
            ((C1440q) this.f17667c).mo2802c(c5347g);
        }
    }
}
