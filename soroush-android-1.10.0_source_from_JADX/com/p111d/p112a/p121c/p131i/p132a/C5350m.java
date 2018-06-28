package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p113a.aa.C1302b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p131i.C1472a;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.Collection;

public final class C5350m implements C1477e<C5350m> {
    protected C1302b f14894a;
    protected C1301a f14895b;
    protected String f14896c;
    protected boolean f14897d = false;
    protected Class<?> f14898e;
    protected C1476d f14899f;

    private C1476d m11491a(C5306f<?> c5306f, C5354j c5354j, Collection<C1472a> collection, boolean z, boolean z2) {
        if (this.f14899f != null) {
            return this.f14899f;
        }
        if (this.f14894a == null) {
            throw new IllegalStateException("Can not build, 'init()' not yet called");
        }
        switch (this.f14894a) {
            case CLASS:
                return new C6505j(c5354j, c5306f.m11092p());
            case MINIMAL_CLASS:
                return new C7093k(c5354j, c5306f.m11092p());
            case NAME:
                return C6506p.m15677a(c5306f, c5354j, collection, z, z2);
            case NONE:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder("Do not know how to construct standard type id resolver for idType: ");
                stringBuilder.append(this.f14894a);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final C1475c mo1444a(C7089f c7089f, C5354j c5354j, Collection<C1472a> collection) {
        if (this.f14894a == C1302b.NONE) {
            return null;
        }
        C1476d a = m11491a(c7089f, c5354j, collection, false, true);
        switch (r6.f14895b) {
            case WRAPPER_ARRAY:
                return new C6500a(c5354j, a, r6.f14896c, r6.f14897d, r6.f14898e);
            case PROPERTY:
            case EXISTING_PROPERTY:
                return new C7091f(c5354j, a, r6.f14896c, r6.f14897d, r6.f14898e, r6.f14895b);
            case WRAPPER_OBJECT:
                return new C6503h(c5354j, a, r6.f14896c, r6.f14897d, r6.f14898e);
            case EXTERNAL_PROPERTY:
                return new C7090d(c5354j, a, r6.f14896c, r6.f14897d, r6.f14898e);
            default:
                StringBuilder stringBuilder = new StringBuilder("Do not know how to construct standard type serializer for inclusion type: ");
                stringBuilder.append(r6.f14895b);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final /* synthetic */ C1477e mo1445a(C1301a c1301a) {
        if (c1301a == null) {
            throw new IllegalArgumentException("includeAs can not be null");
        }
        this.f14895b = c1301a;
        return this;
    }

    public final /* synthetic */ C1477e mo1446a(C1302b c1302b, C1476d c1476d) {
        return m11500b(c1302b, c1476d);
    }

    public final /* synthetic */ C1477e mo1448a(String str) {
        if (str == null || str.length() == 0) {
            str = this.f14894a.f4101f;
        }
        this.f14896c = str;
        return this;
    }

    public final C1478f mo1450a(C7128y c7128y, C5354j c5354j, Collection<C1472a> collection) {
        if (this.f14894a == C1302b.NONE) {
            return null;
        }
        C1476d a = m11491a(c7128y, c5354j, collection, true, false);
        switch (this.f14895b) {
            case WRAPPER_ARRAY:
                return new C6501b(a, null);
            case PROPERTY:
                return new C7092g(a, null, this.f14896c);
            case WRAPPER_OBJECT:
                return new C6504i(a, null);
            case EXTERNAL_PROPERTY:
                return new C6502e(a, null, this.f14896c);
            case EXISTING_PROPERTY:
                return new C7278c(a, null, this.f14896c);
            default:
                StringBuilder stringBuilder = new StringBuilder("Do not know how to construct standard type serializer for inclusion type: ");
                stringBuilder.append(this.f14895b);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final Class<?> mo1451a() {
        return this.f14898e;
    }

    public final C5350m m11500b(C1302b c1302b, C1476d c1476d) {
        if (c1302b == null) {
            throw new IllegalArgumentException("idType can not be null");
        }
        this.f14894a = c1302b;
        this.f14899f = c1476d;
        this.f14896c = c1302b.f4101f;
        return this;
    }
}
